package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.TopicDAO;
import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 15:11
 */
public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        String sql = "SELECT * FROM t_topic WHERE author = ?";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {
        executeUpdate("DELETE FROM t_topic WHERE id = ?",topic.getId());

    }

    @Override
    public Topic getTopic(Integer id) {
        return load("SELECT * FROM t_topic WHERE id = ?",id);
    }
}
