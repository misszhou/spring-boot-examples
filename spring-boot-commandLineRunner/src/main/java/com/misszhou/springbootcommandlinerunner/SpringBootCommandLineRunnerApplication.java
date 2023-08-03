package com.misszhou.springbootcommandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCommandLineRunnerApplication {

    public static void main(String[] args) {
        System.out.println("The service to start.");
        SpringApplication.run(SpringBootCommandLineRunnerApplication.class, args);
        System.out.println("The service has started.");
    }

}
