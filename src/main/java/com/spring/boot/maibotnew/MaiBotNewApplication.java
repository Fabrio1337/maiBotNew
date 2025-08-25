package com.spring.boot.maibotnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.spring.boot.maibotnew")
public class MaiBotNewApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaiBotNewApplication.class, args);
    }

}
