package com.atguigu.qqzone.dao.impl;

import com.atguigu.myssm.basedao.BaseDAO;
import com.atguigu.qqzone.dao.UserBasicDAO;
import com.atguigu.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 11:46
 */
public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        String sql = "SELECT * FROM t_user_basic WHERE loginId = ? AND pwd = ?";
        return super.load(sql,loginId,pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "SELECT fid AS id FROM t_friend WHERE uid = ?";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        String sql = "SELECT * FROM t_user_basic WHERE id = ?";
        return load(sql,id);
    }
}
