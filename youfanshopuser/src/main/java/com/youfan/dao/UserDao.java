package com.youfan.dao;

import com.youfan.domain.User;
import com.youfan.mapper.UserMapper;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public int inserUserInfo(User user){
        return userMapper.inserUserInfo(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public User finUserById(int id){
        return userMapper.findUserById(id);
    }

    public List<User> queryuserbyvo(UserVo userVo){
        return userMapper.queryuserbyvo(userVo);
    }

    public void deleteuserbyid(int id){
        userMapper.deleteuserbyid(id);
    }

    public User findByUsername(String name){
        return userMapper.findByUsername(name);
    }

}
