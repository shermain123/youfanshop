package com.youfan.dao;

import com.youfan.domain.User;
import com.youfan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by sher on 2019/7/7.
 */
@Component
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public User findUserInfo(){
        return userMapper.findUserInfo();
    }

}
