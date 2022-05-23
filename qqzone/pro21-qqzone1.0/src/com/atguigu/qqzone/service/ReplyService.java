package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-23 14:36
 */
public interface ReplyService {
    //根据topic的id获取关联的所有的回复
    List<Reply> getReplyListByTopicId(Integer id);

    //添加回复
    void addReply(Reply reply);

    //删除指定的回复
    void delReply(Integer id);

    //删除指定日志关联的所有的回复
    void delReplyList(Topic topic);

}
