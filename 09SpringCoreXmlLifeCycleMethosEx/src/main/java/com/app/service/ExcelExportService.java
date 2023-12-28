package com.app.service;

public class ExcelExportService {

	  private String filename;
	  private String mode;

      public void setup()
      {
    	  //lot of code
    	  System.out.println("FROM INIT METHOD");
      }
      
      public void clean() 
      {
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
