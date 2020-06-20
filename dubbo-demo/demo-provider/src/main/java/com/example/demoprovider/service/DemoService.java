package com.example.demoprovider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(version="1.0.0")
public class DemoService implements com.example.common.DemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return "调用成功了！！！！";
    }

}
