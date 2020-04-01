package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;
import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class CourseMapperTest {
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void getCourseById() {
        Course course = courseMapper.getCourseById(20001);
        List<Student> students = course.getStudents();
        System.out.println(course.getCourseId() + "," + course.getCourseName());
        System.out.println("**********************");
        students.forEach(student -> {
            System.out.println(student.getStudentId()
                    + "," + student.getStudentName()
                    + "," + student.getHometown()
                    + "," + student.getBirthday());
        });
    }
}