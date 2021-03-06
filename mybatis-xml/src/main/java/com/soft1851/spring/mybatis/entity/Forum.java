package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh_wu
 * @ClassName Forum
 * @Description TODO
 * @Date 2020/3/29:21:00
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
