package com.erwin.controller;

import com.erwin.service.HomeAssistantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanwen.liu on 2018/9/20.
 */
@RestController
@Slf4j
public class HomeAssistantController {

    @Autowired
    private HomeAssistantService assistantService;

    @RequestMapping(value = "/turnOn", method = {RequestMethod.POST, RequestMethod.GET})
    public String turnOn() {
        String body = assistantService.turnOn();
        System.out.println(body);
        return "开启灯光:" + body;
    }

    @RequestMapping(value = "/turnOff", method = {RequestMethod.GET, RequestMethod.POST})
    public String turnOff() {
        String body = assistantService.turnOff();
        System.out.println(body);
        return "关闭灯光:" + body;
    }

    @RequestMapping(value = "/getData", method = {RequestMethod.GET, RequestMethod.POST})
    public String getData(@RequestParam(name = "type") String type) {
        String body = assistantService.getData(type);
        System.out.println(body);
        return "查询状态:" + body;
    }


}
