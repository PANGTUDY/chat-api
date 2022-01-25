package com.pangtudy.chatapi.controller;

import com.pangtudy.chatapi.model.ChatVO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SocketController {
    @MessageMapping("/receive")
    @SendTo("/send")

    public ChatVO SocketHandler(ChatVO socketVO) {
        String userName = socketVO.getUserName();
        String content = socketVO.getContent();

        ChatVO result = new ChatVO(userName, content);

        return result;
    }
}