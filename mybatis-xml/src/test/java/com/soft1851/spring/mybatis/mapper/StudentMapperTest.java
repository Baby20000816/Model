package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-mybatis.xml"})
public class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;
    @Test
    public void batchInsert() {
        List<Student>students = new ArrayList<>();
        for (int i = 0;i<10;i++){
            Student student = Student.builder()
                    .studentId(4000+i)
                    .studentName("测试"+i)
                    .clazzId(1)
                    .hometown("测试城市"+i)
                    .birthday(LocalDate.of(1999,01,01))
                    .build();
            students.add(student);
        }
        System.out.println(studentMapper.batchInsert(students));
    }

    @Test
    public void insert() {
        Student student = Student.builder()
                .clazzId(1)
                .studentName("test-home")
                .hometown("浙江湖州")
                .birthday(LocalDate.of(2000,10,10))
                .build();
        studentMapper.insert(student);
        System.out.println(student.getHometown());
    }

    @Test
    public void delete() {
        studentMapper.delete(4015);
    }

    @Test
    public void update() {
        Student student = studentMapper.getStudentById(4014);
        System.out.println(student);
        student.setStudentName("新");
        student.setHometown("上海");
        student.setBirthday(LocalDate.of(1999,11,12));
        studentMapper.update(student);
        System.out.println(studentMapper.getStudentById(4014));
    }

    @Test
    public void selectAll() {
        List<Student> students =studentMapper.selectAll();
        students.forEach(student -> {
            System.out.println(student.getStudentId()
            +","+student.getStudentName()
            +","+student.getHometown()
            +","+student.getBirthday()

            );
        });
    }

    @Test
    public void getStudentById() {
        Student student= studentMapper.getStudentById(4002);
        System.out.println(student);
    }

    @Test
    public void batchDelete() {
        List<Integer> idList = new ArrayList<>();
        for (int i=0;i<10;i++){
            idList.add(4000+i);
        }
        System.out.println(studentMapper.batchDelete(idList));
    }

    @Test
    public void batchUpdate() {
        List<Student> list = new ArrayList<>();
        for (int i = 1;i<6;i++){
            Student student = Student.builder()
                    .studentId(4000+i)
                    .studentName("测试444"+i)
                    .clazzId(3)
                    .build();
            list.add(student);
        }
        int n = studentMapper.batchUpdate(list);
        System.out.println(n);
    }

    @Test
    public void selectLimit() {
        System.out.println(studentMapper.selectLimit());
    }

    @Test
    public void selectLimitByDynamicSql() {
        System.out.println(studentMapper.selectLimitByDynamicSql(studentMapper.getStudentById(2008)));
    }
}