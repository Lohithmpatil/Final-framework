package com.crm.comcast.genericutitlity;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnear implements ITestListener{
	
	
public void OnTestFailure(ITestResult result) {
String testname=	result.getMethod().getMethodName();
	System.out.println("====Execute===");
	EventFiringWebDriver eDriver=new 	EventFiringWebDriver(BaseClass.sdriver);
      File src=eDriver.getScreenshotAs(OutputType.FILE);
     try 
     {
    	 FileUtils.copyFile(src, new File("./screenshot/"+testname+".png"));
     }
     catch(IOException e)
     {
    	 e.printStackTrace();
     }
  
}
}