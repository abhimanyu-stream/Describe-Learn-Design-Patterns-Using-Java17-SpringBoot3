package com.stream.Composite_Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.desktop.ScreenSleepEvent;

@SpringBootApplication
public class CompositePatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompositePatternApplication.class, args);

		Department salesDepartment = new SalesDepartment(
				1, "Sales department");
		Department financialDepartment = new FinancialDepartment(
				2, "Financial department");
		Department hrDepartment = new HrDepartment(
				3, "Hr department");

		HeadDepartment headDepartment = new HeadDepartment(
				100, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);
		headDepartment.addDepartment(hrDepartment);
		headDepartment.printDepartmentName();
		headDepartment.removeDepartment(financialDepartment);
		System.out.println("-------");
		headDepartment.printDepartmentName();
	}

}
