package com.soft1851.ioc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Description TODO
 * @Author jh_wu
 * @Date 2020/3/17
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Demo {
    private List<Map<String, Object>> list;
    private Set<Phone> set;
    private List<String> list1;
}
