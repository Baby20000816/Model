package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entiy.Rank;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName RankService
 * @Description TODO
 * @Date 2020/3/28
 * @Version 1.0
 **/
public interface RankService {
    /**
     * 查询所有
     * @return List<Video>
     */
    List<Rank> queryAll();


    /**
     * 批量插入
     * @param ranks
     * @return int[]
     */
    int[] bathInsert(List<Rank> ranks);
}
