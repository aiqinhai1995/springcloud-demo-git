package com.aiqinhai.demo.controller;

import com.aiqinhai.demo.vo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Slf4j
@RestController
public class TestController {

    @PostMapping(path = "/interceptordemo")
    public Person getControllerReturnByInterceptor(@RequestBody Person person, HttpServletRequest request) {
        //List存储不同类型的元素
        ArrayList list = new ArrayList();
        list.add("yes");
        list.add(123);
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());

        System.out.println(person.toString());
        person.setAge(23);
        person.setHobby("jumpping");
        //提供controller返回值，使拦截器获取
        request.setAttribute("grade","three");
        return person;
    }
}
