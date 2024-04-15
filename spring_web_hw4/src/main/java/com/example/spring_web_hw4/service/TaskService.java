package com.example.spring_web_hw4.service;

import com.example.spring_web_hw4.domain.Priority;
import com.example.spring_web_hw4.domain.Task;
import com.example.spring_web_hw4.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public Task addTask(String description, String level, Date finishingTime){
            Task task = new Task(description, Priority.valueOf(level.toUpperCase()), finishingTime);
            repository.addTask(task);

            return task;
    }

    public List<Task> getTasks(){
        return repository.getTasks();
    }
}
