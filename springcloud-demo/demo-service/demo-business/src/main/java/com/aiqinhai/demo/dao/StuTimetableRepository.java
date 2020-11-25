package com.aiqinhai.demo.dao;

import com.aiqinhai.demo.entity.StuTimetable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface StuTimetableRepository extends JpaRepository<StuTimetable,Integer>, JpaSpecificationExecutor<StuTimetable> {

    @Query("select stu.subject as subject,count(stu.subject) as subjectnum from StuTimetable stu group by stu.subject having count(stu.subject)>0")
    Page<Object[]> findDistinctSubjectAndCount(Pageable pageable);
}
