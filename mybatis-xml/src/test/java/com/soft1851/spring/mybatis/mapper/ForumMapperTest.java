package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class ForumMapperTest {
    @Resource
private StudentMapper studentMapper;
    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("test")
                .hometown("江苏南京")
                .birthday(LocalDate.of(2000,10,10))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getStudentId());
        System.out.println(student.getBirthday());
        System.out.println(student.getHometown());
    }

    @Test
    public void delete() {
        studentMapper.delete(2011);
    }

    @Test
    public void update() {
        Student student = studentMapper.getStudentById(2012);
        System.out.println(student);
        student.setStudentName("新");
        student.setHometown("上海");
        student.setBirthday(LocalDate.of(1999,11,12));
        studentMapper.update(student);
        System.out.println(studentMapper.getStudentById(2012));
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void getStudentById() {
       Student student= studentMapper.getStudentById(2012);
        System.out.println(student);
    }
}