package com.youfan.controller;

import com.youfan.domain.User;
import com.youfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sher on 2019/7/7.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = userService.findUserInfo();
        if(user != null){
            System.out.println("name:"+user.getName());

        }
        return user;
    }

    /**
     * 注册页面跳转
     * */
    @RequestMapping(value = "/toRegister",method = RequestMethod.GET)
    public String rigster(){

        return "rigster";
    }

    /**
     * 注册
     * */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public void rigster(User user){
        userService.inserUserInfo(user);
        return ;
    }

    /***
     * 修改用户信息跳转
     * */
    @RequestMapping(value = "/toEditUser",method = RequestMethod.GET)
    public String toEditUser(Model model,Integer id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "editUser";
    }

    /**
     * 用户修改
     * */
    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    public void editUser(User user){
        userService.updateUser(user);
    }

    /**
     * 用户详情
     * */
    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public String userInfo(Model model,Integer id){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "userInfo";
    }
}
