package com.soft1851.spring.web.service;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.entiy.Topic;
import com.soft1851.spring.web.spider.JueJinSpider;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class TopicServiceTest {
    @Resource
    private TopicService topicService;

    @Test
    public void queryAll() {
        topicService.queryAll();
    }

    @Test
    public void addTopic() {
        Topic topic = Topic.builder()
                .id("3")
                .topicName("test")
                .topicIcon("1.png")
                .description("111")
                .msgCount(111)
                .followsCount(111)
                .followed(true)
                .build();
                topicService.addTopic(topic);
    }

//    @SneakyThrows
    @Test
    public void batchInsert() throws IOException {
        int[] ints = topicService.batchInsert(JueJinSpider.getTopics());
        assertEquals(JueJinSpider.getTopics().size(),ints.length);
    }
}