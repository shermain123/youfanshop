package com.youfan.mapper;

import com.youfan.domain.User;
import com.youfan.vo.UserVo;

import java.util.List;

/**
 * Created by sher on 2019/7/7.
 */
public interface UserMapper {

    public User findUserInfo();

    public int inserUserInfo(User user);

    public  int updateUser(User user);

    public User findUserById(Integer id);

    public List<User> queryuserbyvo(UserVo userVo);

    public void deleteuserbyid(int id);

    public User findByUsername(String name);
}
