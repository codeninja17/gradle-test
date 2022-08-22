package com.example.demo.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class OldDemoService implements DemoService, InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OldDemoService ...");
    }
}
