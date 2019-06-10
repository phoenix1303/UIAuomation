package com.oliulka.demoUI.flows;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oliulka.demoUI.pages.Page01HomePage;
import com.oliulka.demoUI.pages.Page02SearchResultsPage;

public class FLow02SearchResultsFlow{

    private static Page01HomePage page01;
    private static Page02SearchResultsPage page02;
     
 	public FLow02SearchResultsFlow(){
	}

    public void productSearchFlow(WebDriver driver) 
    {
    	driver.get("http://www.amazon.com");
    	WebElement homeLogo = page01.homepageAmazonLogo(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOf(homeLogo));
    	System.out.println("Amazon home page was accessed successfully");
    	assertTrue(page01.homepageAmazonSearchBar(driver).isDisplayed());
    	assertTrue(page01.homepageAmazonSearchButton(driver).isDisplayed());
    	assertTrue(page01.homepageAmazonNavigation(driver).isDisplayed());
    	assertTrue(page01.homepageAmazonHamburgerMenu(driver).isDisplayed());
    	System.out.println("Home page elements were asserted successfully"); 
     }
    
}
