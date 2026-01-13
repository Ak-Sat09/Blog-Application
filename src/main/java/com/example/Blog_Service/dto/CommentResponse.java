package com.example.Blog_Service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentResponse {

    private Long id;
    private Long userId;
    private String text;
    private LocalDateTime createdAt;
}