package com.designpattern.observer_design_pattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class NewsAgency {
// Publisher of news
    private String news;
    private String newsAgencyName;
    private NewsType newsType;
    private List<Channel> channelList = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channelList.add(channel);
    }
    public void addObserver(Channel channel, NewsType newsType) {
        this.channelList.add(channel);
        this.newsType = newsType;
    }

    public void removeObserver(Channel channel) {
        this.channelList.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channelList) {
            channel.update(this.news);
        }
    }
}
