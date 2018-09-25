package com.erwin;

import com.erwin.controller.HomeAssistantController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yanwen.liu on 2018/9/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeAssistantTest {

    @Autowired
    HomeAssistantController controller;

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void turnOnTest() {
        String result = controller.turnOn();
        System.out.println(result);
    }

    @Test
    public void turnOffTest() {
        String result = controller.turnOff();
        System.out.println(result);
    }

    @Test
    public void getDataTest() {
        String type = "climate.mi_acpartner";
//        type = "sun.sun";
//        type = "binary_sensor.motion_sensor_158d0002006dee_2";
//        type = "sensor.humidity_158d0001f23ccf";
        String result = controller.getData(type);
        System.out.println(result);
    }
}
