package com.soft1851.spring.web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Description Web应用配置类，取代web.xml
 * @Author wf
 * @Date 2020/3/24
 * @Version 1.0
 */
public class WebApplicationConfig implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //创建一个基于注解的web应用的上下文配置的对象，实现AnnotationConfigRegistry
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //讲webMvcConfig的配置类注册进来
        ctx.register(WebMvcConfig.class );
        //设置servletContext优先级最高
        ctx.setServletContext(servletContext);
        //刷新
        ctx.refresh();
        //配置了ctx的映射规则的对象
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        //添加规则
        registration.addMapping("/");
        //设置该servlet的启动优先级
        registration.setLoadOnStartup(1);
    }
}
