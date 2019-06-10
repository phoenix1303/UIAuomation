package com.oliulka.demoUI.tests;

import org.testng.annotations.Test;
import com.oliulka.demoUI.DemoUIAbstractTest;
import com.oliulka.demoUI.flows.*;

public class Test01HomePageTests extends DemoUIAbstractTest {
	
	
	@Test(enabled = true)
	public void Tes01HomePage() throws InterruptedException
	{
		System.out.println("SetUp is over. Starting actual test");
		FLow01HomePage flow01 = new FLow01HomePage();
		flow01.homePageBasicElementsFlow(driver);	
	}
	
	@Test(enabled = true)
	public void Tes01AssertingHamburgerMenu() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		flow01.homePageHamburgrMenuFlow(driver);	
	}

}
