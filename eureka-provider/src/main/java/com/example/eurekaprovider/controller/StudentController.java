package com.example.eurekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MrWang
 * @date: 2018/9/6
 */


@RestController
public class StudentController {

    @GetMapping("/student")
    public Object student(){
        Student student = new Student();
        student.setId("1");
        student.setName("MrWang");
        student.setSex("男");
        student.setPort(8003);
        return student;
    }

    class Student{
        private String id;
        private String name;
        private String sex;
        private Integer port;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }
}
