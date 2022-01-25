package com.pangtudy.chatapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatVO {
    private String userName;
    private String content;
}