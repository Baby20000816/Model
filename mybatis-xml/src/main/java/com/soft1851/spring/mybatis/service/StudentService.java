package com.soft1851.spring.mybatis.service;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.entity.Forum;

/**
 * @author jh_wu
 * @ClassName StudentService
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
public interface StudentService {
    /**
     * 关键字找人
     * @param matterDto
     */
    void selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto);
}
