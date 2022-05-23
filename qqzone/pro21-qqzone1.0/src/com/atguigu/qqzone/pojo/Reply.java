package com.atguigu.qqzone.pojo;

import java.util.Date;

/**
 * @author adventure
 * @create 2022-05-22 11:12
 */
public class Reply {
    private Integer id;
    private String content;
    private Date replyDate;
    private UserBasic author;
    private Topic topic;  //M : 1

    public Reply(String content, Date replyDate, UserBasic author, Topic topic) {
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
    }

    private HostReply hostReply;  //1 : 1

    public Reply(){};
    public Reply(Integer id){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public HostReply getHostReply() {
        return hostReply;
    }

    public void setHostReply(HostReply hostReply) {
        this.hostReply = hostReply;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", replyDate=" + replyDate +
                ", author=" + author +
                ", topic=" + topic +
                ", hostReply=" + hostReply +
                '}';
    }
}
