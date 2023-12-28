package com.app.affan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
public class Test {

	public static void main(String args[])
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(ProductReportService.class);
		//ProductReportService ps = ac.getBean("ProductReportService",ProductReportService.class);
		ProductReportService ps = ac.getBean(ProductReportService.class);
		ps.GenerateReport();
	}
}
