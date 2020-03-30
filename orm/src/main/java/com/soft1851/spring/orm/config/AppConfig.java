package com.soft1851.spring.orm.config;

import com.soft1851.spring.orm.entity.Forum;
import com.soft1851.spring.orm.entity.Post;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jh_wu
 * @ClassName AppConfig
 * @Description TODO
 * @Date 2020/3/17:12:19
 * @Version 1.0
 **/
@Configuration
public class AppConfig {
    @Bean
    public Forum forum() {
        return new Forum();
    }
    @Bean
    public Post post(){
        return new Post();
    }

}
