package com.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice4Test {
 
	@Test
public void demo()
	{
		
	Reporter.log("welcome",true);
	String browser = System.getProperty("BROWSER");
	String url = System.getProperty("URL");
	String pwd = System.getProperty("PASSWORD");
	Reporter.log(browser,true);
	Reporter.log(url,true);
	Reporter.log(pwd,true);
	Reporter.log("poll",true);
	
	
	}

}
