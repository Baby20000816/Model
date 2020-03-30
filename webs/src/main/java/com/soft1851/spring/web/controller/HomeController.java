package com.soft1851.spring.web.controller;

import com.soft1851.spring.web.entiy.Book;
import com.soft1851.spring.web.entiy.Card;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 * @Description TODO
 * @Author wf
 * @Date 2020/3/24
 * @Version 1.0
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        //使用model接口将数据返回到客户端
        model.addAttribute("message", "Hello Spring MVC~~");
        List<Book> list = new ArrayList<>();
        Book book = Book.builder().name("JAVA").price(50.00).cover("https://cdn.sspai.com/article/86205611-1058-016e-8ecb-0c72e3af1085.jpg?imageMogr2/quality/95/thumbnail/!528x288r/gravity/Center/crop/528x288/interlace/1").build();
        Book book1 = Book.builder().name("JS").price(20.00).cover("https://cdn.sspai.com/article/b33be9a0-4686-d52a-74ba-c5c2412dc3ff.jpg?imageMogr2/quality/95/thumbnail/!528x288r/gravity/Center/crop/528x288/interlace/1").build();
        Book book2 = Book.builder().name("JSs").price(20.00).cover("https://cdn.sspai.com/article/5a8f9ff4-c2ab-6146-8696-daff18cb1dec.jpg?imageMogr2/quality/95/thumbnail/!528x288r/gravity/Center/crop/528x288/interlace/1").build();
        Book book3 = Book.builder().name("JSs").price(20.00).cover("https://cdn.sspai.com/article/3dec8950-b668-8b22-ad50-d710dcb8a4b1.jpg?imageMogr2/quality/95/thumbnail/!528x288r/gravity/Center/crop/528x288/interlace/1").build();
        list.add(book);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        model.addAttribute("list", list);

        Card[] cards ={
                new Card("https://cdn.sspai.com/2020/03/16/c19f991137bc9ef520d1b5d21bc93f18.png?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2020/03/18/avatar/c47c9399e96cfb918144be9968c71730.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/article/28fd79f0-02cd-6305-62c1-dee8c08a5927.jpg?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","一日一技，在新版电脑上重回经典铃声","https://cdn.sspai.com/attachment/origin/2016/04/20/323468.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/2020/03/15/7412a84b985455fd4935d0e524dad3ad.png?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2020/03/07/939ce782046111eb35f0c6825ed8e5ff.jpeg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/article/f846fc77-5ac8-d315-7774-c8c6f7ce372d.jpg?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2020/01/29/a105141a801e8a089c2d8106a55233bb.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/2020/03/15/7412a84b985455fd4935d0e524dad3ad.png?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2020/03/07/939ce782046111eb35f0c6825ed8e5ff.jpeg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/article/e2191681-bcff-0274-68e2-2261f9cd9b41.jpg?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2018/03/25/ce2a784deb3097acb6ee9d37ea0c13ea.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/article/7ce1302a-eadb-c43b-84fd-a7342c55a7a7.jpg?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/attachment/origin/2016/08/31/345261.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/article/345e6e34-2525-a639-4d89-d3144cdf956a.jpg?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2017/08/07/17d24c3a67f19359872ec6e54e386725.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1"),
                new Card("https://cdn.sspai.com/2020/03/03/32975811ea553ed3c2e7426e81cf563b.png?imageMogr2/quality/95/thumbnail/!800x400r/gravity/Center/crop/800x400/interlace/1","20202020年如何才能有一个个人网站","https://cdn.sspai.com/2018/03/25/ce2a784deb3097acb6ee9d37ea0c13ea.jpg?imageMogr2/quality/95/thumbnail/!48x48r/gravity/Center/crop/48x48/interlace/1")
        };
        List<Card> cardList = Arrays.asList(cards);
        model.addAttribute("cardList",cardList);

        Map<String,Object>cardMap = new HashMap<>();
        cardMap.put("心态要好","https://cdn.sspai.com/2020/03/24/avatar/df807a5467301c080c9baa66a3a702b8.?imageMogr2/quality/95/thumbnail/!72x72r/gravity/Center/crop/72x72/interlace/1");
        model.addAttribute("map",cardMap);
        //返回页面
        return "templates/home";
    }

}
