package com.pine.moudles.sys.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.pine.moudles.sys.model.entity.auth.User;
import com.pine.moudles.sys.service.auth.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chenbupang on 2018-2-2 21:38
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private IUserService userService;

    @RequestMapping("")
    @ResponseBody
    public User index(){
        return userService.selectOne(new EntityWrapper<User>().where("username={0}","admin"));
    }

    @RequestMapping("404")
    public String error_404(){
        return "/404";
    }

    @RequestMapping("500")
    public String error_500(){
        return "/500";
    }

    @GetMapping("beetl")
    public String beetl(){
        return "/beetl";
    }

    @RequestMapping("/beetl2")
    public ModelAndView beetl2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("beetl2", "beetl2");
        modelAndView.setViewName("beetl2");
        return modelAndView;
    }
}
