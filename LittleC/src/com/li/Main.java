package com.li;

import com.li.model.News;
import com.li.model.NewsFactory;
import com.li.view.NewsListViewer;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        String resource_path = Main.class.getClassLoader().getResource("read_hub").getPath();

        NewsFactory newsReader = new NewsFactory(resource_path);
        ArrayList<News> newsList = newsReader.fecth();
        NewsListViewer viewer = new NewsListViewer(newsList);
        viewer.dispiay();

    }
}
