package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entiy.Topic;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName TopicService
 * @Description TODO
 * @Date 2020/3/27
 * @Version 1.0
 **/
public interface TopicService {
    /**
     * 查询所有Topic
     * @return
     */
    List<Topic> queryAll();

    /**
     * 新增Topic
     * @param topic
     */
    void addTopic(Topic topic);

    /**
     * 批量插入
     * @param topics
     * @return
     */
    int[] batchInsert(List<Topic> topics);
}
