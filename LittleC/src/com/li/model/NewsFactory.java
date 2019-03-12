package com.li.model;

import java.io.*;
import java.util.ArrayList;

public class NewsFactory {
    /*
    * 读取文件，生成News对象
    * */

    private File newsDir;
    //获取路径
    public NewsFactory(String dir) throws IOException {
        newsDir = new File(dir);

        if (!newsDir.exists()){
            System.out.println("路径不存在！");
        }
        if (!newsDir.isDirectory()){
            System.out.println("路径不合法！");

        }
    }
    //读取文件
    public ArrayList<News> fecth(){
        ArrayList<News> newslist = new ArrayList<>();
        File[] files = newsDir.listFiles();
       if (files!=null){
           for (File file:files) {
               try {
                   BufferedReader reader = new BufferedReader(new FileReader(file));
                   String title = reader.readLine();//读取title
                   reader.readLine();//跳过空行
                   String content = reader.readLine();//读取content
                   News news = new News(title,content);//创建News对象

                   reader.readLine();//跳过空行
                   String date = reader.readLine();//读取相关时间
                   String related_title = reader.readLine();//读取相关标题
                   news.addRelated(date,related_title);
                   newslist.add(news);//读取完成后，装入 newslist 中


               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }

        return newslist;
    }

}




