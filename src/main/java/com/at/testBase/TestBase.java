package com.at.testBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	public WebDriver driver;
	
	
	@BeforeMethod
    public void setUp() {
		driver = new ChromeDriver();
    	driver.get("http://localhost/login.do");
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    
    
	@AfterMethod
    public void tearDown()
    {
    	driver.close();
    }
}
