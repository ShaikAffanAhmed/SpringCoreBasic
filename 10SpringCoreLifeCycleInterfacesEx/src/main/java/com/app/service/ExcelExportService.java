package com.app.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExportService {
	  private String filename;
	  private String mode;
	  
	  @PostConstruct
	   public void afterPropertiesSet()throws Exception {
         //lot of code
    	  System.out.println("FROM INIT METHOD");
      }
        @PreDestroy
         public void destroy() throws Exception {
		 //some code
    	  System.out.println("FROM DESTROY METHOD");
      }

	  public ExcelExportService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	  }

	  public String getFilename() {
		return filename;
	  }

	  public void setFilename(String filename) {
		this.filename = filename;
		System.out.println("FROM SETTER METHOD");
      }

	  public String getMode() {
		return mode;
	  }

      public void setMode(String mode) {
		this.mode = mode;
      }

	  @Override
	  public String toString() {
		return "ExcelExportService [filename=" + filename + ", mode=" + mode + "]";
      }
	    
}
