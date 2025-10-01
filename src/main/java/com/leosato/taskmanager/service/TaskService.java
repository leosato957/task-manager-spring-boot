package com.leosato.taskmanager.service;

import com.leosato.taskmanager.dto.TaskRequestDTO;
import com.leosato.taskmanager.dto.TaskResponseDTO;
import com.leosato.taskmanager.model.Task;
import com.leosato.taskmanager.repository.TaskRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskResponseDTO createTask(TaskRequestDTO dto) {
        Task task = new Task(
                null, //
                dto.getTitle(),
                dto.getDescription(),
                dto.getDueDate(),
                LocalDateTime.now(),
                "PENDING"
        );

        Task savedTask = taskRepository.save(task);

        return new TaskResponseDTO(
                savedTask.getId(),
                savedTask.getTitle(),
                savedTask.getDescription(),
                savedTask.getDueDate(),
                savedTask.getCreatedAt(),
                savedTask.getStatus()
        );
    }

    public List<TaskResponseDTO> getAllTasks() {

        List<Task> tasks = taskRepository.findAll();

        return tasks.stream()
                .map(task -> new TaskResponseDTO(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getDueDate(),
                        task.getCreatedAt(),
                        task.getStatus()
                ))
                .collect(Collectors.toList());
    }
}