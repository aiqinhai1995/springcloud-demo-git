package com.aiqinhai.demo.controller;

import com.aiqinhai.demo.service.StuTimeTableService;
import com.aiqinhai.demo.vo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Slf4j
@RestController
public class TestController {

    @Autowired
    StuTimeTableService stuTimeTableService;

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

    @PostMapping(path = "/getdistinctsubjectandcount")
    public void getDistinctSubjectAndCount() {

        int page = 0;
        int pagesize = 10;
        Sort defaultSort = new Sort(Sort.Direction.DESC,"subject");
        Pageable pageable = PageRequest.of( page, pagesize, defaultSort);
        Page<Object[]> distinctSubjectAndCountPage = stuTimeTableService.getDistinctSubjectAndCount(pageable);
        List<Object[]> contents = distinctSubjectAndCountPage.getContent();
        for (int i = 0; i < contents.size(); i++) {
            Object[] content = (Object[]) contents.get(i);
            System.out.println("科目："+content[0]);
            System.out.println("科目数量："+content[1]);
        }
    }
}
