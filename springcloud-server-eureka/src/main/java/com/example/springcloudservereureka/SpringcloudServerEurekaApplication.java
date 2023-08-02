package com.example.springcloudservereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServerEurekaApplication.class, args);
        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }

}
