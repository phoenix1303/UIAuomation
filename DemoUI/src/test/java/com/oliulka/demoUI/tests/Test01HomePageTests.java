package com.oliulka.demoUI.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.oliulka.demoUI.DemoUIAbstractTest;
import com.oliulka.demoUI.flows.*;

public class Test01HomePageTests extends DemoUIAbstractTest {
	
	
	@Test(enabled = true)
	public void Tes01HomePage() throws InterruptedException
	{
		System.out.println("In test");
		FLow01HomePage flow01 = new FLow01HomePage();
		flow01.homePageTest(driver);	
	}

}
