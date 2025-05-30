package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_SoftAssert {
	WebDriver driver;
	@Test
	
	void method1()
	{
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	//String var= driver.getCurrentUrl();
	String var1 = driver.getTitle();
	SoftAssert sa = new SoftAssert();
	//sa.assertEquals(var,"https://demo.automationtesting.in/Alerts.html");
	sa.assertEquals(var1, "Alerts");
	System.out.println("Current Title is "+ var1);
	sa.assertAll();

	}
}
