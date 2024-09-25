package com.designpattern.observer_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class ObserverDesignPatternApplication {

	public static void main(String[] args) {




		NewsAgency observable = new NewsAgency();// provider of new or publisher of news [observable]
		observable.setNewsAgencyName("ANI");
		NewsChannel observer = new NewsChannel();// require new news from NewsAgency, so it is subscriber[observer]
		observer.setChannelName("CNN");
		observable.addObserver(observer);// one or many newChannel(s) is being registered/listed with newsAgency
		observable.setNews("today headlines are...india won in world cup match");// a new news whose contains is today headlines are... being published to all listed/subscribed/registered newsChannel
		System.out.println(observable.getNewsAgencyName());
		System.out.println(observer.getChannelName() +"  " +observer.getNews());


		observable.setNews("today headlines are...india made F35 jet fighter");
		System.out.println(observer.getChannelName() +"  " + observer.getNews());
		observable.setNews("today headlines are...india made B2 bomber");
		System.out.println(observer.getChannelName() +"  " + observer.getNews());






		NewsChannel observer2 = new NewsChannel();// require new news from NewsAgency, so it is subscriber[observer]
		observer2.setChannelName("DW");
		observable.addObserver(observer2);// one or many newChannel(s) is being registered/listed with newsAgency
		observable.setNews("today headlines are...india beat China");// a new news whose contains is today headlines are... being published to all listed/subscribed/registered newsChannel
		System.out.println(observer2.getChannelName() +"  " + observer2.getNews());



		NewsChannel observer3 = new NewsChannel();// require new news from NewsAgency, so it is subscriber[observer]
		observer3.setChannelName("CNBC");
		observable.addObserver(observer3);// one or many newChannel(s) is being registered/listed with newsAgency
		observable.setNews("today headlines are...india dominating China");// a new news whose contains is today headlines are... being published to all listed/subscribed/registered newsChannel
		System.out.println(observer3.getChannelName() +"  " + observer3.getNews());
	}

}
/****
 * Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple
 * objects about any events that happen to the object they’re observing.
 */