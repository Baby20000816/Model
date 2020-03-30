package orm.dao;

import com.soft1851.spring.orm.dao.ForumDao;
import com.soft1851.spring.orm.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
//@ContextConfiguration(classes = {SpringDataSourceConfig.class})

public class ForumDaoTest {
@Autowired
private ForumDao forumDao;
    @Test
    public void insert() {
        Forum forum = Forum.builder().forumName("论坛测试").build();
        int n = forumDao.insert(forum);
        assertEquals(1,n);
    }

    @Test
    public void batchInsert() {
        Forum[] forums = {
                Forum.builder().forumName("论坛测试1").build(),
                Forum.builder().forumName("2").build(),
                Forum.builder().forumName("3").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumDao.batchInsert(forumList);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = forumDao.delete(16);
        assertEquals(1,n);
    }

    @Test
    public void update() {
        Forum forum = forumDao.get(17);
        forum.setForumName("测试论坛修改新的名称");
        int n = forumDao.update(forum);
        assertEquals(1,n);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(17);
        assertNotNull(forum);
        System.out.println(forum);
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
        assertEquals(15,forums.size());
//        System.out.println(forums);
    }
}