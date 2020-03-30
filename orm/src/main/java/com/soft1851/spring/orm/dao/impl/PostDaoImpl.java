package com.soft1851.spring.orm.dao.impl;

import com.soft1851.spring.orm.dao.PostDao;
import com.soft1851.spring.orm.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author jh_wu
 * @ClassName PostDaoImpl
 * @Description TODO
 * @Date 2020/3/17:18:00
 * @Version 1.0
 **/
@Repository
public class PostDaoImpl implements PostDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Post post) {
        String sql = "INSERT INTO t_post VALUES (NULL,?,?,?,?,?)";
        Object[] args = {
                post.getForumId(),
                post.getTitle(),
                post.getContent(),
                post.getThumbnail(),
                post.getCreateTime()};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int[] batchInsert(List<Post> posts) {
        final List<Post> postList = posts;
        String sql = "INSERT INTO t_post VALUES (NULL,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,posts.get(i).getForumId());
                preparedStatement.setString(2,posts.get(i).getTitle());
                preparedStatement.setString(3,posts.get(i).getContent());
                preparedStatement.setBytes(4,posts.get(i).getThumbnail());
                preparedStatement.setTimestamp(5,posts.get(i).getCreateTime());
            }
            @Override
            public int getBatchSize() {
                return postList.size();
            }
        });
    }

    @Override
    public int delete(int postId) {
        String sql = "DELETE FROM t_post WHERE post_id=?";
        Object[] args={postId};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int[] batchDelete(List<Integer> posts) {
        String sql = "DELETE FROM t_post WHERE post_id=?";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,posts.get(i));
            }
            @Override
            public int getBatchSize() {
                return posts.size();
            }
        });
    }

    @Override
    public Post get(int postId) {
        String sql = "SELECT * FROM t_post WHERE post_id = ?";
        Object[] args = {postId};
        return jdbcTemplate.queryForObject(sql,args,new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public List<Post> selectByKeyword(String keywords) {
        String sql = "SELECT * FROM t_post WHERE  content LIKE '%' ? '%'";
        Object[] args = {keywords};
        return jdbcTemplate.query(sql,args,new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public int count() {
        String sql = "SELECT * FROM t_post";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Post.class)).size();
    }
}
