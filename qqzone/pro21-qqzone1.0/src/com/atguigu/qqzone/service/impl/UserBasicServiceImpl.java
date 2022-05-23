package com.atguigu.qqzone.service.impl;

import com.atguigu.qqzone.dao.UserBasicDAO;
import com.atguigu.qqzone.pojo.UserBasic;
import com.atguigu.qqzone.service.UserBasicService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 15:19
 */
public class UserBasicServiceImpl implements UserBasicService {

    private UserBasicDAO userBasicDAO = null;

    @Override
    public UserBasic login(String loginId, String pwd) {
        UserBasic userBasic = userBasicDAO.getUserBasic(loginId,pwd);
        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        //此处得到的userBasicList中只有id属性值，所以需要再次遍历，得到其他属性值
        List<UserBasic> userBasicList = userBasicDAO.getUserBasicList(userBasic);

        //再次遍历后，将得到的含有其他属性值的userBasic对象存入friendList中
        List<UserBasic> friendList = new ArrayList<>(userBasicList.size());

        for (int i = 0; i < userBasicList.size(); i++) {
            UserBasic friend = userBasicList.get(i);
            friend = userBasicDAO.getUserBasicById(friend.getId());
            friendList.add(friend);
        }

        return friendList;
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        return userBasicDAO.getUserBasicById(id);
    }
}
