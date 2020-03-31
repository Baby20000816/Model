package com.soft1851.spring.mybatis.dto;

import com.soft1851.spring.mybatis.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh_wu
 * @ClassName MatterDto
 * @Description TODO
 * @Date 2020/3/31:19:16
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MatterDto {
    private String teacherName;
    private String clazzName;
    private Student student;
}
