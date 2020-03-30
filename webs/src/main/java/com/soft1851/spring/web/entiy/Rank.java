package com.soft1851.spring.web.entiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh_wu
 * @ClassName Rank
 * @Description TODO
 * @Date 2020/3/28:20:49
 * @Version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rank {
    private Integer id;
    private String pic;
    private String title;
    private String view;
    private String danmaku;
    private String follow;
    private String info;
    private String pts;
}
