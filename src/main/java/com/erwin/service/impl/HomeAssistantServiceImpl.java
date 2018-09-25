package com.erwin.service.impl;

import com.alibaba.fastjson.JSON;
import com.erwin.service.HomeAssistantService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanwen.liu on 2018/9/20.
 */
@Slf4j
@Service
public class HomeAssistantServiceImpl implements HomeAssistantService {

    @Value("${home_assistant_url}")
    private String apiUrl;

    String encoding = "UTF-8";

    @Override
    public String turnOn() {
        String body = null;
        try {
            String url = apiUrl + "/services/light/turn_on";

            Map<String, String> map = new HashMap<>();
            map.put("entity_id", "light.xiaomi_philips_light");

            body = callUrl(url, map);

        } catch (Exception e) {
            log.error("turnOn服务调用异常：", e);
        }
        return body;
    }

    @Override
    public String turnOff() {
        String body = null;
        try {
            String url = apiUrl + "/services/light/turn_off";

            Map<String, String> map = new HashMap<>();
            map.put("entity_id", "light.xiaomi_philips_light");

            body = callUrl(url, map);

        } catch (Exception e) {
            log.error("turnOn服务调用异常：", e);
        }
        return body;
    }

    @Override
    public String getData(String type) {
        String body = null;
        try {
            String url = apiUrl + "/states/" + type;

            body = callUrl(url);
        } catch (Exception e) {
            log.error("turnOn服务调用异常：", e);
        }
        return body;
    }



    private String callUrl(String url, Map<String, String> map) {
        String body = null;
        try {
            //创建httpclient对象
            CloseableHttpClient client = HttpClients.createDefault();
            //创建post方式请求对象
            HttpPost httpPost = new HttpPost(url);
            //设置参数到请求对象中
            String data = JSON.toJSONString(map);
            httpPost.setEntity(new ByteArrayEntity(data.getBytes()));
            //设置header信息
            //指定报文头【Content-type】、【x-ha-access】
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setHeader("x-ha-access", "hachina");

            //执行请求操作，并拿到结果（同步阻塞）
            CloseableHttpResponse response = client.execute(httpPost);
            //获取结果实体
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                //按指定编码转换结果实体为String类型
                body = EntityUtils.toString(entity, encoding);
            }
            EntityUtils.consume(entity);
            //释放链接
            response.close();
        } catch (Exception e) {
            log.error("callUrl error：", e);
        }
        return body;
    }

    private String callUrl(String url) {
        String body = null;
        try {
            //创建httpclient对象
            CloseableHttpClient client = HttpClients.createDefault();
            //创建post方式请求对象
            HttpGet httpGet = new HttpGet(url);
            //设置header信息
            //指定报文头【Content-type】、【x-ha-access】
            httpGet.setHeader("Content-type", "application/json");
            httpGet.setHeader("x-ha-access", "hachina");

            //执行请求操作，并拿到结果（同步阻塞）
            CloseableHttpResponse response = client.execute(httpGet);
            //获取结果实体
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                //按指定编码转换结果实体为String类型
                body = EntityUtils.toString(entity, encoding);
            }
            EntityUtils.consume(entity);
            //释放链接
            response.close();
        } catch (Exception e) {
            log.error("callUrl error：", e);
        }
        return body;
    }
}
