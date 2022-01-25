package com.pangtudy.chatapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSockConfig implements WebSocketMessageBrokerConfigurer {

/*    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/sub");
        config.setApplicationDestinationPrefixes("/pub");
    }*/

    @Override
    // 클라이언트가 메시지를 구독할 endpoint를 정의합니다.
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/send");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/").setAllowedOrigins("*")
                .withSockJS();
    }
}