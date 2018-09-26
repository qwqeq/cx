package com.yunda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JltlApplication {
    public static void main(String[] args) {
        SpringApplication.run(JltlApplication.class, args);
    }
}
