package com.designpattern.observer_design_pattern;

import lombok.Data;

@Data
public class NewsChannel implements Channel{
// Subscriber of NewsAgency for news
    private String news;
    private String channelName;

    private NewsType type;// here news channel can set preferred type of news. like sports, political, space science, defence

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }



    public void setNews(String news) {
        this.news = news;
    }
    public String getNews() {
        return news;
    }
}
