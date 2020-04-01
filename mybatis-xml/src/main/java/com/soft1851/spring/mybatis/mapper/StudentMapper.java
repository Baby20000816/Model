package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.entity.Forum;
import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName StudentMapper
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {
    /**
     * 批量插入
     * @param students
     * @return int
     */
    int batchInsert(@Param("students")List<Student> students);

    /**
     * 新增实体
     * @param student
     */
    void insert(Student student);

    /**
     * 根据id删除
     * @param id
     */
    void delete(int id);

    /**
     * 修改
     * @param student
     */
    void update(Student student);

    /**
     * 查询所有学生，按生日排序，多对一关联查询学生所在班级信息
     * @return List<Student>
     */
    List<Student> selectAll1();
    /**
     * 查询所有学生
     * @return List<Student>
     */
    List<Student> selectAll();

    /**
     * 根据id查询Student
     * @param id
     * @return Student
     */
    Student getStudentById(int id);

    /**
     * 批量删除
     * @param idList
     * @return
     */
    int batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 批量修改
     * @param students
     * @return int
     */
    int batchUpdate(@Param("students") List<Student> students);

    /**
     * 单表带两个指定条件查询
     * @return
     */
    List<Student> selectLimit();

    /**
     * 单表指定条件查询（结合动态sql）
     * @param student
     * @return
     */
    List<Student> selectLimitByDynamicSql(Student student);
    /**
     * 关键字找人
     * @param matterDto
     */
    void selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto);
}
