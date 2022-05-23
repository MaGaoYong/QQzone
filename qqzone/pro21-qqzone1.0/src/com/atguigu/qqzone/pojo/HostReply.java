package com.atguigu.qqzone.pojo;

import java.util.Date;

/**
 * @author adventure
 * @create 2022-05-22 11:12
 */
public class HostReply {
    private Integer id;
    private String content;
    private Date hostReplyDate;
    private UserBasic author;   //M : 1
    private Reply reply;    //1 : 1

    public HostReply(){};
    public HostReply(Integer id){};

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

    public Date getHostReplyDate() {
        return hostReplyDate;
    }

    public void setHostReplyDate(Date hostReplyDate) {
        this.hostReplyDate = hostReplyDate;
    }

    public UserBasic getAuthor() {
        return author;
    }

    public void setAuthor(UserBasic author) {
        this.author = author;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "HostReply{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", hostReplyDate=" + hostReplyDate +
                ", author=" + author +
                ", reply=" + reply +
                '}';
    }
}
