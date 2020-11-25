package com.aiqinhai.demo.service;

import com.aiqinhai.demo.dao.StuTimetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StuTimeTableService {

    @Autowired
    StuTimetableRepository stuTimetableRepository;

    public Page<Object[]> getDistinctSubjectAndCount(Pageable pageable){
        return stuTimetableRepository.findDistinctSubjectAndCount(pageable);
    }
}
