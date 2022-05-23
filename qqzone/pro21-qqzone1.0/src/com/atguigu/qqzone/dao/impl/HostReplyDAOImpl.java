package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.HostReplyDAO;
import com.atguigu.qqzone.pojo.HostReply;

/**
 * @author adventure
 * @create 2022-05-23 14:49
 */
public class HostReplyDAOImpl  extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("SELECT * FROM t_host_reply WHERE reply = ?",replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        super.executeUpdate("DELETE FROM t_host_reply WHERE id = ?",id);
    }
}
