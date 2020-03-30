package com.soft1851.spring.web.service.impl;

import com.soft1851.spring.web.dao.ForumDao;
import com.soft1851.spring.web.entity.Forum;
import com.soft1851.spring.web.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author jh_wu
 * @ClassName ForumServiceImpl
 * @Description TODO
 * @Date 2020/3/19:21:22
 * @Version 1.0
 **/
@Service
public class ForumServiceImpl implements ForumService {
@Autowired
private ForumDao forumDao;
    @Override
    public List<Forum> selectAll() {
        return forumDao.selectAll();
    }

    @Override
    public Forum get(int forumId) {
        return forumDao.get(forumId);
    }
}
