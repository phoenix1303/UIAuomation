package com.oliulka.demoUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Page01HomePage{
	
    private static WebElement element = null;
	
    public static WebElement lnk_MyAccount(WebDriver driver)
    {
    	element = driver.findElement(By.cssSelector("a[href='http://shop.demoqa.com/my-account/']"));
    	return element;
    }
 
    public static WebElement lnk_LogOut(WebDriver driver)
    {
    	element = driver.findElement(By.id("account_logout"));
    	return element;
    }
 
}
