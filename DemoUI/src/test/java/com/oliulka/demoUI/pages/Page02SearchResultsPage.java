package com.oliulka.demoUI.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page02SearchResultsPage{
	
    public static List <WebElement> searchResults(WebDriver driver)
    {
    	return driver.findElements(By.cssSelector(""));
    }
 
}
