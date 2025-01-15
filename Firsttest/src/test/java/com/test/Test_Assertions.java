package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Test_Assertions {
	WebDriver driver;
	@Test(priority=1)
	void method1()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		String str= driver.getTitle();
		System.out.println(str);
		Assert.isTrue(true, str, "Automation Demo Site");
	}
		@Test(priority=2)
	void method2()
	{
		driver.close();
	}
	


}
