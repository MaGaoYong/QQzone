package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 11:38
 */
public interface TopicDAO {
    //1.获取指定用户的所有日志
    public List<Topic> getTopicList(UserBasic userBasic);

    //2.添加日志
    public void addTopic(Topic topic);

    //3.删除日志
    void delTopic(Topic topic);

    //4.获取指定日志信息
    Topic getTopic(Integer id);

}
