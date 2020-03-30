package com.soft1851.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jh_wu
 * @ClassName HomeController
 * @Description TODO
 * @Date 2020/3/24:10:24
 * @Version 1.0
 **/
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("message","hello spring");
        return "home";
    }
}
