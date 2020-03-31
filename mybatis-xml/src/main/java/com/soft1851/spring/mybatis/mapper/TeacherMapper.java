package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Teacher;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jh_wu
 * @ClassName TeacherMapper
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface TeacherMapper {
    /**
     *
     * 根据teacherId一对一关联查询管理的班级信息
     * @param teacherId
     * @return Teacher
     */
    Teacher getTeacherOneToOne(int teacherId);
}
