package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class OldDemoService implements DemoService, InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OldDemoService .....");
    }
}
