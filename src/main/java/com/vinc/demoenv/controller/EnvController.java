package com.vinc.demoenv.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class EnvController {

    @Value("${my.env.property}")
    private String myEnvProperty;

    @GetMapping
    public Mono<String> getApiResponse() {
        return Mono.just(myEnvProperty);
    }

}
