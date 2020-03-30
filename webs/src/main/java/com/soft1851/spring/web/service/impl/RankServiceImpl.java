package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.dao.RankDao;
import com.soft1851.spring.web.entiy.Rank;
import com.soft1851.spring.web.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName RankServiceImpl
 * @Description TODO
 * @Date 2020/3/28:23:35
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class RankServiceImpl implements RankService {
    @Autowired
    private RankDao rankDao;

    @Override
    public List<Rank> queryAll() {
        return rankDao.selectAll();
    }

    @Override
    public int[] bathInsert(List<Rank> ranks) {
        return rankDao.batchInsert(ranks);
    }
}
