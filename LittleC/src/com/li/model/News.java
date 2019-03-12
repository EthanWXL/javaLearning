package com.li.model;

import java.util.HashMap;
import java.util.Map;

public class News {
    private String title;
    private String content;
    private Map<String,String> related;

    public News(String title,String content){
        this.title = title;
        this.content = content;
        this.related = new HashMap<>();//日期->标题
    }

    public void addRelated(String date,String related_title ){
        related.put(date,related_title);
    }
    public Map<String,String> getRelated(){
        return related;
    }

    public String getTitle(){
        return title;
    }

    public String getContent() {
        return content;
    }
}
