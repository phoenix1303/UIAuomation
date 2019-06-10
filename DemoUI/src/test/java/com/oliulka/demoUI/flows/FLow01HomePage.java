package com.oliulka.demoUI.flows;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import com.oliulka.demoUI.pages.Page01HomePage;

public class FLow01HomePage{

    private static Page01HomePage page01;
     
 	public FLow01HomePage(){
	}

    public static void homePageTest(WebDriver driver) 
     {
    	System.out.println("In the flow");
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 driver.get("http://www.store.demoqa.com");
    	 page01.lnk_MyAccount(driver).click();
    	 System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
     }
}
