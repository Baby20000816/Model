package com.soft1851.spring.web.service;

import com.soft1851.spring.web.config.SpringDataSourceConfig;
import com.soft1851.spring.web.entiy.Rank;
import com.soft1851.spring.web.spider.BilibiliSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class RankServiceTest {
    @Autowired
    private RankService rankService;

    @Test
    public void queryAll() {
        List<Rank> ranks = rankService.queryAll();
        assertEquals(50,ranks.size());
    }

    @Test
    public void bathInsert() {
        int[] ints = rankService.bathInsert(BilibiliSpider.getRanks());
        assertEquals(BilibiliSpider.getRanks().size(),ints.length);
    }
}