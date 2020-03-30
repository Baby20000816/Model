package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.entity.Forum;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName ForumDao
 * @Description TODO
 * @Date 2020/3/17:15:18
 * @Version 1.0
 **/
public interface ForumDao {
    /**
     * 新增
     * @param forum
     * @return
     */
    int insert(Forum forum);

    /**
     * 批量新增
     * @param forums
     * @return
     */
    int[] batchInsert(List<Forum> forums);

    /**
     * 删除
     * @param forumId
     * @return
     */

    int delete(int forumId);

    /**
     * 修改
     * @param forum
     * @return
     */
    int update(Forum forum);

    /**
     * 查询
     * @param forumId
     * @return
     */
    Forum get(int forumId);

    /**
     * 查询所有
     * @param
     * @return
     */
    List<Forum> selectAll();
}
