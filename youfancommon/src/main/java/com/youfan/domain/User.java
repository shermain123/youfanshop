package com.youfan.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    //主键
    private Integer id;
    //名称
    private String name;
    //年龄
    private Integer age;
    //用户名
    private String username;
    //密码
    private String password;
    //密码加密
    private String passwordencrypt;
    //地址
    private String address;
    //电话
    private String telphone;
    //qq
    private String qq;
    //微信
    private String weixin;
    //邮箱
    private String email;
    //性别
    private String sex;
    //生日
    private String birthday;


}