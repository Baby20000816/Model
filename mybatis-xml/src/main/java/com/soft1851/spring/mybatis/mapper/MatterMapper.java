package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.dto.MatterDto;
import com.soft1851.spring.mybatis.vo.MatterVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jh_wu
 * @ClassName MatterMapper
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface MatterMapper {
    /**
     * 多表指定条件查询（结合动态SQL）
     * @param matterDto MatterDto
     * @return List<MatterVo>
     */
    List<MatterVo> selectLimitFromTeacherInClassByDynamicSql(MatterDto matterDto);
}
