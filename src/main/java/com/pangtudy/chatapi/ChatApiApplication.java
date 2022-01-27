package com.pangtudy.chatapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class ChatApiApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ChatApiApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "10831"));
        app.run(args);
    }

}
