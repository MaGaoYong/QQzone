package com.atguigu.qqzone.service;

import com.atguigu.qqzone.pojo.HostReply;

/**
 * @author adventure
 * @create 2022-05-23 14:45
 */
public interface HostReplyService {
    HostReply getHostReplyByReplyId(Integer replyId);

    void delHostReply(Integer id);
}
