package com.li.view;

import com.li.model.News;

import java.util.ArrayList;

public class NewsListViewer {
    private ArrayList<News> newslist;

    public NewsListViewer(ArrayList<News> newslist){
        this.newslist = newslist;
    }
    public void dispiay(){
        for(News news:newslist){
            System.out.println("--------------------------------");
            System.out.println("Title:"+news.getTitle());
            System.out.println("Content:"+news.getContent());
            //填写代码，输出相关新闻
            System.out.println("related:"+news.getRelated());

        }
    }
}
