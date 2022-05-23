package com.atguigu.qqzone.controller;

import com.atguigu.qqzone.pojo.Topic;
import com.atguigu.qqzone.pojo.UserBasic;
import com.atguigu.qqzone.service.TopicService;
import com.atguigu.qqzone.service.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author adventure
 * @create 2022-05-22 15:40
 */
public class UserController {

    private UserBasicService userBasicService;
    private TopicService topicService;

    //登陆验证
    public String login(String loginId, String pwd, HttpSession session){


        //用UserBasicService中的login()方法得到一个userBasic，
        UserBasic userBasic = userBasicService.login(loginId, pwd);

        //如果得到的userBasic不为空，这证明数据库中有此loginId，和pwd
        if (userBasic!=null){
            //同时得到此用户中的好友列表和日志列表
            List<UserBasic> friendList = userBasicService.getFriendList(userBasic);
            //此处的日志列表信息只有id，没有其他信息
            List<Topic> topicList = topicService.getTopicList(userBasic);

            //将得到的好友列表和日志列表存入userBasic和session中
            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);

            //userBasic这个key保存的是登陆者的信息
            //friend这个key保存的是当前进入的是谁的空间
            session.setAttribute("userBasic",userBasic);
            session.setAttribute("friend",userBasic);
            return "index";
        }else {
            return "login";
        }

    }

    public String friend(Integer id,HttpSession session){

        //1.根据id获取指定的用户信息
        UserBasic currFriend = userBasicService.getUserBasicById(id);

        List<Topic> topicList = topicService.getTopicList(currFriend);

        currFriend.setTopicList(topicList);

        session.setAttribute("friend",currFriend);

        return "index";


    }
}
