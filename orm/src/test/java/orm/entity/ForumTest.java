package orm.entity;

import com.soft1851.spring.orm.config.AppConfig;
import com.soft1851.spring.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class ForumTest {
    @Autowired
    private Forum forum;

    @Test
    public void test() {
        forum.setForumId(1);
        forum.setForumName("wjh");
        System.out.println(forum);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.scan("com.soft1851.ioc.config");
        Forum forum = (Forum) ctx.getBean("forum");
        forum.setForumId(1);
        forum.setForumName("111");
        System.out.println(forum);
    }

}