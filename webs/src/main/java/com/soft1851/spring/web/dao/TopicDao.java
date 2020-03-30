package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entiy.Topic;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName TopicDao
 * @Description TODO
 * @Date 2020/3/26:10:04
 * @Version 1.0
 **/
public interface TopicDao {
    /**
     * 查询所有
     * @return List<Topic>
     */
    List<Topic> selectAll();

    /**
     * 批量插入
     * @param topics
     * @return int[]
     */
    int[] batchInsert(List<Topic> topics);

    /**
     * 插入
     * @param topic
     * @return
     */
    int insert(Topic topic);
}
