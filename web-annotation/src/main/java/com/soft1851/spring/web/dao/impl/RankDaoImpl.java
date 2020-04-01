package com.soft1851.spring.web.dao.impl;

import com.soft1851.spring.web.dao.RankDao;
import com.soft1851.spring.web.entiy.Rank;
import com.soft1851.spring.web.entiy.Topic;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author jh_wu
 * @ClassName RankDaoImpl
 * @Description TODO
 * @Date 2020/3/28:23:21
 * @Version 1.0
 **/
@Repository
public class RankDaoImpl implements RankDao {
    @Resource
    private final JdbcTemplate jdbcTemplate;

    public RankDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Rank> selectAll() {
        String sql = "SELECT * FROM t_rank";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Rank.class));
    }

    @Override
    public int[] batchInsert(List<Rank> ranks) {
        final List<Rank> rankList = ranks;
        String sql = "INSERT INTO t_rank ( pic, title, view, pts, danmaku, follow, info)" +
                "VALUES(?,?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter(){
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
               Rank rank = rankList.get(i);
//                preparedStatement.setInt(1,rank.getId());
                preparedStatement.setString(1,rank.getPic());
                preparedStatement.setString(2,rank.getTitle());
                preparedStatement.setString(3,rank.getView());
                preparedStatement.setString(4,rank.getPts());
                preparedStatement.setString(5,rank.getDanmaku());
                preparedStatement.setString(6,rank.getFollow());
                preparedStatement.setString(7,rank.getInfo());
            }

            @Override
            public int getBatchSize() {
                return rankList.size();
            }
        });
    }

}
