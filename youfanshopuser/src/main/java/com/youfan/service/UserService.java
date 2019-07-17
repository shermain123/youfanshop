package com.youfan.service;

import com.youfan.dao.UserDao;
import com.youfan.domain.User;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sher on 2019/7/7.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

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

    public List<User> queryuserbyvo(UserVo userVo){
        return userDao.queryuserbyvo(userVo);
    }

    public void deleteuserbyid(int id){
        userDao.deleteuserbyid(id);
    }

    public User findByUsername(String name){
        return userDao.findByUsername(name);
    }

}
