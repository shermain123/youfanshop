package com.youfan.service;

import com.youfan.dao.UserDao;
import com.youfan.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sher on 2019/7/7.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User findUserInfo(){
        return userDao.findUserInfo();
    }

    public int inserUserInfo(User user){
        return userDao.inserUserInfo(user);
    }

    public int updateUser(User user){return userDao.updateUser(user);}

    public User findUserById(int id){
        return userDao.finUserById(id);
    }


}
