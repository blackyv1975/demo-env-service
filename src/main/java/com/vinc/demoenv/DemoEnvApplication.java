package com.vinc.demoenv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoEnvApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEnvApplication.class, args);
    }



}
