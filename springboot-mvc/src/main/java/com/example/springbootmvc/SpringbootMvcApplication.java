package com.example.springbootmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmvc.domain")
public class SpringbootMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMvcApplication.class, args);
    }

}
