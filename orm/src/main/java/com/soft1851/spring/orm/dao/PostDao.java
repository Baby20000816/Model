package com.soft1851.spring.orm.dao;

import com.soft1851.spring.orm.entity.Post;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName PostDao
 * @Description TODO
 * @Date 2020/3/17
 * @Version 1.0
 **/
public interface PostDao {
    /**
     * 新增
     * @param post
     * @return
     */
    int insert(Post post);

    /**
     * 批量新增
     * @param posts
     * @return
     */
    int[] batchInsert(List<Post> posts);

    /**
     * 删除
     * @param postId
     * @return
     */

    int delete(int postId);

    /**
     * 批量删除
     * @param posts
     * @return
     */

    int[] batchDelete(List<Integer> posts);


    /**
     * 查询
     * @param postId
     * @return
     */
    Post get(int postId);

    /**
     * 关键字查找
     * @param keywords
     * @return
     */
    List<Post> selectByKeyword(String keywords);

    /**
     * 数量
     * @param
     * @return
     */
    int count();

}
