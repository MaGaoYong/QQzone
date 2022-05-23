package com.atguigu.myssm.myspringmvc;

/**
 * @author adventure
 * @create 2022-05-22 20:13
 */
public class PageController {
    public String page(String page){
        //意思是：返回 frames/left
        //目的是给中央控制器DistpatcherServlet,
        // 在DistpatcherServlet内部跳转到left.html页面，
        //使left.html可以被thymeleaf渲染
        return page;
    }
}
