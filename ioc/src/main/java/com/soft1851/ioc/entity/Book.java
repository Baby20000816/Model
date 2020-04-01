package com.soft1851.ioc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh_wu
 * @ClassName Book
 * @Description TODO
 * @Date 2020/3/17:12:32
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private Double price;
}
