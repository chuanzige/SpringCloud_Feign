package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.service.StudentConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MrWang
 * @date: 2018/9/6
 */

@RestController
public class StudentController {

    @Autowired
    private StudentConsumer studentConsumer;

    @GetMapping("/student")
    public Object eurekaClient() {
        Object student = studentConsumer.student();
        System.out.println(student);
        return student;
    }
}