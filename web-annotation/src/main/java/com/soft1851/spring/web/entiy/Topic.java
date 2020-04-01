package com.soft1851.spring.web.entiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh_wu
 * @ClassName Topic
 * @Description TODO
 * @Date 2020/3/26:10:02
 * @Version 1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    private String id;
    private String topicName;
    private String topicIcon;
    private String description;
    private Integer followsCount;
    private Integer msgCount;
    private Boolean followed;
}
