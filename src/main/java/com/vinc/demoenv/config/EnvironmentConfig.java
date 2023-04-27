package com.vinc.demoenv.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfig {

    @Value("${server.port}")
    private int serverPort;
    @Value("${my.env.property}")
    private String myEnvProperty;

    @Bean
    ApplicationListener<ApplicationReadyEvent> envListener() {

        return event -> {
            System.out.println(serverPort);
            System.out.println(myEnvProperty);
        };
    }

}
