package com.youfan.mapper;

import com.youfan.domain.User;

/**
 * Created by sher on 2019/7/7.
 */
public interface UserMapper {

    public User findUserInfo();

    public int inserUserInfo(User user);

    public  int updateUser(User user);

    public User findUserById(Integer id);
}
