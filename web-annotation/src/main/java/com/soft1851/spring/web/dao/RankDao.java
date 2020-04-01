package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entiy.Rank;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName RankDao
 * @Description TODO
 * @Date 2020/3/28
 * @Version 1.0
 **/
public interface RankDao {
    /**
     * 查询所有
     * @return
     */
    List<Rank> selectAll();

    /**
     * 批量插入
     * @param ranks
     * @return int[]
     */
    int[] batchInsert(List<Rank> ranks);
}
