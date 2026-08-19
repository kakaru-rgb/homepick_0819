package com.onrender.homepick_0819.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class QnaDto{
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String status;
    private LocalDateTime createdAt;
}