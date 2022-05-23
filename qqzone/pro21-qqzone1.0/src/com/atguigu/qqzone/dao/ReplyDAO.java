package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 11:43
 */
public interface ReplyDAO {
    //获取指定日志的恢复列表
    List<Reply> getReplyList(Topic topic);

    //添加回复
    void addReply(Reply reply);

    //删除回复
    void delReply(Integer id);

    //根据id获取指定的Reply
    Reply getReply(Integer id);

}