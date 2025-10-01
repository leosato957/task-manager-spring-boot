package com.leosato.taskmanager.controller;

import com.leosato.taskmanager.dto.TaskRequestDTO;
import com.leosato.taskmanager.dto.TaskResponseDTO;
import com.leosato.taskmanager.service.TaskService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/tasks") // Default Rote (ex: GET http://localhost:8080/api/tasks)
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<TaskResponseDTO> createTask(@Valid @RequestBody TaskRequestDTO taskRequest) {
        TaskResponseDTO createdTask = taskService.createTask(taskRequest);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TaskResponseDTO>> getAllTasks() {
        List<TaskResponseDTO> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }
}