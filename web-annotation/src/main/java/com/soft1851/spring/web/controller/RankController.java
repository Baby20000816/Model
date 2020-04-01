package com.soft1851.spring.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.service.RankService;
import com.soft1851.spring.web.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author jh_wu
 * @ClassName RankController
 * @Description TODO
 * @Date 2020/3/28:23:49
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/")
public class RankController {
    @Resource
    private RankService rankService;

    @GetMapping(value = "ranks",produces = "appliacation/json;charset=utf-8")
    @ResponseBody
    public String getRanks(){
        ResponseObject rs = new ResponseObject(1,"success",rankService.queryAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("rank")
    public String rank(Model model){
        model.addAttribute("ranks",rankService.queryAll());
        return "templates/rank";
    }

}
