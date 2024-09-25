package com.designpattern.FactoryPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {
	// Factory design pattern is a way to code for interface rather than implementation
	// Factory pattern removes the instantition of actual implementtaion classes from client code to factory class
	// Factory pattern makes our code more robust less coupled and easy to extend so we can easily change class implementation because client program is unaware of this.

	public static void main(String[] args) {

		SpringApplication.run(FactoryPatternApplication.class, args);

		Computer PC_Desktop = ComputerFactory.getComputer(ComputerType.PC_Desktop,"32GB", "2.23 HGZ", "1000 GB", true, true);
		Computer Laptop = ComputerFactory.getComputer(ComputerType.Laptop,"32GB", "2.23 HGZ", "500 GB", true, true);

		Computer Server = ComputerFactory.getComputer(ComputerType.Server,"32GB", "500 HGZ", "100000 GB", true, true);

		System.out.println(PC_Desktop);
		System.out.println(Laptop);
		System.out.println(Server);

	}

}
