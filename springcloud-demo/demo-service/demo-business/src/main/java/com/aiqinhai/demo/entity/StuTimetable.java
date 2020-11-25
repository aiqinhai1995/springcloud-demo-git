/**
 * @author ：yz
 * @date ：Created in 2020/11/25 10:22
 * @description：
 * @modified By：
 * @version: $
 */
package com.aiqinhai.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stu_timetable")
public class StuTimetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "subject", nullable = false)
    private String subject;

    @Basic
    @Column(name = "segments", nullable = false)
    private Integer segments;

    @Basic
    @Column(name = "class_time", nullable = false)
    private Date classTime;
}
