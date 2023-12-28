package com.app.affan;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService {

	//@Scheduled(fixedDelay = 2000)  //in milli sec
	//@Scheduled(fixedDelayString = "4000")  //in milli sec
	//@Scheduled(fixedRate = 3000)
	//@Scheduled(cron = "10 * * * * *")   //Execute task every min, 10th sec  [it is not 10sec gap, at 10th sec of minute]
	//@Scheduled(cron = "*/10 * * * * *")  //Execute task every 10secs
	//@Scheduled(cron = "* */10 * * * *")  //
	  @Scheduled(cron = "0 0 9 * 3 *") 
	public void GenerateReport()
	{	
		System.out.println("HELLO" +" "+ new Date());
	}
}
