package com.erwin.service;

/**
 * Created by yanwen.liu on 2018/9/20.
 */
public interface HomeAssistantService {
    /**
     * 开启飞利浦台灯
     *
     * @return
     */
    String turnOn();

    /**
     * 关闭飞利浦台灯
     *
     * @return
     */
    String turnOff();

    String getData(String type);
}
