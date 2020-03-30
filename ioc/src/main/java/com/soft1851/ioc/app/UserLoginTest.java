package com.soft1851.ioc.app;

import com.soft1851.ioc.entity.User;
import com.soft1851.ioc.entity.UserLogin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author wf
 * @Date 2020/3/17
 * @Version 1.0
 */
public class UserLoginTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserLogin userLogin = (UserLogin) ac.getBean("userLogin");
        User user = (User) ac.getBean("user");
        user.setAccount("admin");
        user.setPassword("1234");
    }
}
