package com.designpattern.singleton_design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonDesignPatternApplication.class, args);

		SingletonDesignPatternLazyInitialization instance = SingletonDesignPatternLazyInitialization.getInstance();
		System.out.println(instance);
	}

}
