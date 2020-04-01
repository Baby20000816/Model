package com.soft1851.spring.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh_wu
 * @ClassName Forum
 * @Description TODO
 * @Date 2020/4/1:16:04
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Forum {
    private Integer forumId;
    private String forumName;
}
