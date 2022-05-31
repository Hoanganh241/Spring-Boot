package com.aptech.hello_t2010a.controller;

import com.aptech.hello_t2010a.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "api/hello")

public class HelloController {
    @RequestMapping(path = "say", method = RequestMethod.GET)
    public String say(){
        return "Hello World";
    }
    @RequestMapping (path = "talk", method = RequestMethod.GET)
    public String talk(){
        return "Bonjour";
    }

    @RequestMapping (path = "student", method = RequestMethod.GET)
    public Student getStudent(){
        return Student.builder()
                .rollNumber("A001")
                .fulllName("Nguyễn Hoàng Anh")
                .email("anhnhth201002@fpt.edu.vn")
                .phone("0981251615")
                .address("Hà Lội")
                .dob(LocalDateTime.of(2002,01, 24,12,23))
                .build();
    }
}
