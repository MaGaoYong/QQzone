package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 11:34
 */
public interface UserBasicDAO {

    //1.根据账号和密码获取特定用户信息
    public UserBasic getUserBasic(String loginId,String pwd);

    //2.获取指定用户的所有好友列表
    public List<UserBasic> getUserBasicList(UserBasic userBasic);

    //3.根据ID查询UserBasic的信息
    UserBasic getUserBasicById(Integer id);



}
