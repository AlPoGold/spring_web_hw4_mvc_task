package com.example.spring_web_hw4.repository;

import com.example.spring_web_hw4.domain.Task;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    //TODO make log
}
