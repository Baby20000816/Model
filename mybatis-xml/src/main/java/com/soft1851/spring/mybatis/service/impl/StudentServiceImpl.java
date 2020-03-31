package com.soft1851.spring.mybatis.service.impl;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.mapper.ForumMapper;
import com.soft1851.spring.mybatis.mapper.StudentMapper;
import com.soft1851.spring.mybatis.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author jh_wu
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public void selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto) {
        studentMapper.selectLimitFromTeacherInClassByDynamicSql(matterDto);
    }
}
