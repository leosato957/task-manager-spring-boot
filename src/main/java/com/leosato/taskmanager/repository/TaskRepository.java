package com.leosato.taskmanager.repository;

import com.leosato.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Spring Data JPA cuida do CRUD aqui.
}