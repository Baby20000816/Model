package com.soft1851.spring.web.entiy;

import lombok.Data;

/**
 * @author jh_wu
 * @ClassName Card
 * @Description TODO
 * @Date 2020/3/24:21:14
 * @Version 1.0
 **/
@Data
public class Card {
    private String image;
    private String distribute;
    private String author;

    public Card(String image, String distribute, String author) {
        this.image = image;
        this.distribute = distribute;
        this.author = author;
    }
}
