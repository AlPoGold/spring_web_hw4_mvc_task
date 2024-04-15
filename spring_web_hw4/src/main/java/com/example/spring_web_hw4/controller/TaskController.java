package com.example.spring_web_hw4.controller;

import com.example.spring_web_hw4.domain.Task;
import com.example.spring_web_hw4.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.logging.Level;


@Controller
@AllArgsConstructor
@Log
public class TaskController {

    TaskService service;


    @GetMapping("/tasks")
    public String getTasks(Model model){
        model.addAttribute("tasks", service.getTasks());
        return "tasks.html";

    }

    @PostMapping("/tasks")
    public String addTaskFromBody(@RequestParam String description,
                                  @RequestParam String level,
                                  @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")Date finishingDate,
                                      Model model){
        service.addTask(description, level, finishingDate);
        log.log(Level.INFO, "task was added!");


        model.addAttribute("tasks", service.getTasks());

        return "tasks.html";
    }





}
