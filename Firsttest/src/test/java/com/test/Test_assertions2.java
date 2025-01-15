package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_assertions2 {
	@Test
	void method1()
	{
WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		String str= driver.getTitle(); 
		String act_title = "Alerts";
//Assert.assertEquals(str, act_title);	
		//Assert.assertTrue(true);
		//Assert.assertTrue(false);
		//Assert.assertFalse(false);
		//Assert.assertFalse(true);
		//Assert.assertTrue(str==act_title);
		//Assert.fail();
		
		

		
		
	}

}
