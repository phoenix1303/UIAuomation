package com.oliulka.demoUI.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page01HomePage{
	
    public  WebElement homepageAmazonLogo (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("a[href='/ref=nav_logo']"));
    }
 
    public WebElement homepageAmazonSearchBar(WebDriver driver)
    {
    	return driver.findElement(By.id("twotabsearchtextbox"));
    }
    
    public  WebElement homepageAmazonSearchButton(WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("input.nav-input[value='Go']"));
    }
    
    public WebElement homepageAmazonNavigation(WebDriver driver)
    {
    	return driver.findElement(By.id("nav-xshop"));
    }
    
    public WebElement homepageAmazonHamburgerMenu(WebDriver driver)
    {
    	return driver.findElement(By.id("nav-hamburger-menu"));
    }
}
