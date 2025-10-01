package com.leosato.taskmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskResponseDTO {

    private Long id;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;
    private String status;
}