package com.soft1851.ioc.app;

import com.soft1851.ioc.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jh_wu
 * @ClassName StudentTest
 * @Description TODO
 * @Date 2020/3/17:9:52
 * @Version 1.0
 **/
public class StudentTest {
    private static Logger logger = LoggerFactory.getLogger(StudentTest.class);
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("student");
        logger.info(student.toString());
    }
}
