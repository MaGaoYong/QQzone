package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.ReplyDAO;
import com.atguigu.qqzone.pojo.Reply;
import com.atguigu.qqzone.pojo.Topic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-23 15:09
 */
public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {

    @Override
    public List<Reply> getReplyList(Topic topic) {
        return executeQuery("SELECT * FROM t_reply WHERE topic = ?",topic.getId());
    }

    @Override
    public void addReply(Reply reply) {
        String sql = "INSERT INTO t_reply VALUES(0,?,?,?,?)";
        executeUpdate(sql,reply.getContent(),reply.getReplyDate(),reply.getAuthor().getId(),reply.getTopic().getId());
    }

    @Override
    public void delReply(Integer id) {
        executeUpdate("DELETE FROM t_reply WHERE id = ?",id);
    }

    @Override
    public Reply getReply(Integer id) {
        return load("SELECT * FROM t_reply WHERE id = ?",id);
    }
}
