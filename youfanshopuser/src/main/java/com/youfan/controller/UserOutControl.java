package com.youfan.controller;

import com.youfan.domain.User;
import com.youfan.service.UserService;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sher on 2019/7/16.
 */
@RestController
public class UserOutControl {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listoutUser",method = RequestMethod.GET)
    public List<User> listoutUser() {
        UserVo userVo = new UserVo();
        List<User> listuser = userService.queryuserbyvo(userVo);
        return listuser;
    }

    @RequestMapping(value = "/useroutregister",method = RequestMethod.POST)
    public void userregister(@RequestBody User user) {
        userService.inserUserInfo(user);
        return;
    }

    @RequestMapping(value = "/findByUsername",method = RequestMethod.GET)
    public User findByUsername(@RequestParam String  name, Model model){
        User user =  userService.findByUsername(name);
        return user;
    }
}
