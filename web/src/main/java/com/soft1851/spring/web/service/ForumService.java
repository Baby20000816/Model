package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Forum;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName ForumService
 * @Description TODO
 * @Date 2020/3/19:21:46
 * @Version 1.0
 **/

public interface ForumService {
    List<Forum> selectAll();

    Forum get(int forumId);
}
