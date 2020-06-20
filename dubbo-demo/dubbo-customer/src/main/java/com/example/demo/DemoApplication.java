package com.example.demo;


import com.example.common.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    @DubboReference(version = "1.0.0", url = "dubbo://127.0.0.1:20880")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            System.out.print(demoService.sayHello("mercyblitz"));
        };
    }

}
