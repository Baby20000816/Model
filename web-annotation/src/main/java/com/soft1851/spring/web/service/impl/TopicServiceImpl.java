package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.dao.TopicDao;
import com.soft1851.spring.web.entiy.Topic;
import com.soft1851.spring.web.service.TopicService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jh_wu
 * @ClassName TopicServiceImpl
 * @Description TODO
 * @Date 2020/3/27:21:25
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicDao topicDao;
    @Override
    public List<Topic> queryAll() {
        return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return topicDao.batchInsert(topics);
    }
}
