package com.aiqinhai.demo.controller;

import com.aiqinhai.demo.vo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class TestController {

    @PostMapping(path = "/demo1")
    public Person demo1(@RequestBody Person person, HttpServletRequest request) {
        System.out.println(person.toString());
        person.setAge(23);
        person.setHobby("jumpping");
        request.setAttribute("grade","three");
        return person;
    }
}
