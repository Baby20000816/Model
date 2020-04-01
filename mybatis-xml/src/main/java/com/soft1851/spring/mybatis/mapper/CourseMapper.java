package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jh_wu
 * @ClassName CourseMapper
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface CourseMapper {
    /**
     * 根据班课id查询班课详情（班课自身信息， 学生列表）
     * @param courseId
     * @return Course
     */
    Course getCourseById(int courseId);
}
