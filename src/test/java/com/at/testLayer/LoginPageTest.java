package com.at.testLayer;

import org.testng.annotations.Test;

import com.at.pageLayer.LoginPage;
import com.at.testBase.TestBase;

public class LoginPageTest extends TestBase {
       @Test
       public void verifyLoginPage() throws InterruptedException {
    	   
    	   LoginPage l = new LoginPage(driver);
    	   l.enter_Username("admin");
    	   Thread.sleep(2000);
    	   l.enter_password("manager");
    	   Thread.sleep(2000);
    	   l.click_loginbtn();
    	   Thread.sleep(7000);
    	   String str = driver.getTitle();
    	   System.out.println(str);
    			   
    	   
       }
       
}
