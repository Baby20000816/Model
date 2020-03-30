package com.soft1851.spring.web.dao.impl;

import com.soft1851.spring.web.dao.TopicDao;
import com.soft1851.spring.web.entiy.Topic;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author jh_wu
 * @ClassName TopicDaoImpl
 * @Description TODO
 * @Date 2020/3/26:10:04
 * @Version 1.0
 **/
@Repository

public class TopicDaoImpl implements TopicDao {
    @Resource
    private final JdbcTemplate jdbcTemplate;

    public TopicDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Topic> selectAll() {
        String sql = " SELECT * FROM t_topic ";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Topic.class));
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        final List<Topic> topicList=topics;
        String sql = "INSERT INTO t_topic(id, topic_name, topic_icon, description,follows_count, msg_count, followed) " + "VALUES (?,?,?,?,?,?,?)" ;
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Topic topic = topicList.get(i);
                ps.setString(1,topic.getId());
                ps.setString(2,topic.getTopicName());
                ps.setString(3,topic.getTopicIcon());
                ps.setString(4,topic.getDescription());
                ps.setInt(5,topic.getMsgCount());
                ps.setInt(6,topic.getFollowsCount());
                ps.setBoolean(7,topic.getFollowed());
            }

            @Override
            public int getBatchSize() {
                return topicList.size();
            }
        });
    }

    @Override
    public int insert(Topic topic) {
        String sql = "INSERT INTO t_topic(id,topic_name, topic_icon, description,follows_count, msg_count, followed) " + "VALUES (?,?,?,?,?,?,?)" ;
        Object[] params = {
                topic.getId(),
                topic.getTopicName(),
                topic.getTopicIcon(),
                topic.getDescription(),
                topic.getMsgCount(),
                topic.getFollowsCount(),
                topic.getFollowed()};
        return jdbcTemplate.update(sql,params);
    }
}
