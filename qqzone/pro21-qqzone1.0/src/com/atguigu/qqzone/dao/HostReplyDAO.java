package com.atguigu.qqzone.dao;

import com.atguigu.qqzone.pojo.HostReply;

/**
 * @author adventure
 * @create 2022-05-22 11:45
 */
public interface HostReplyDAO {

    //根据replyId查询关联的HostReply实体
    HostReply getHostReplyByReplyId(Integer replyId);

    //删除特定的hostReply
    void delHostReply(Integer id);

}
