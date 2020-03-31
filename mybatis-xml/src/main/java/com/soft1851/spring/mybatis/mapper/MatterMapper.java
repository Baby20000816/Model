package com.soft1851.spring.mybatis.mapper;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author jh_wu
 * @ClassName MatterMapper
 * @Description TODO
 * @Date 2020/3/31
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface MatterMapper {
}
