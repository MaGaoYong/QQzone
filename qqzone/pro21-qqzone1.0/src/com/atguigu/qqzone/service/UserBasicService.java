package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 15:18
 */
public interface UserBasicService {
    //登陆验证
    UserBasic login(String loginId,String pwd);

    //获取好友列表
    List<UserBasic> getFriendList(UserBasic userBasic);

    //根据id获取指定用户信息
    UserBasic getUserBasicById(Integer id);
}
