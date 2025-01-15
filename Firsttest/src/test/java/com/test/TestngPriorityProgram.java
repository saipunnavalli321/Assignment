package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngPriorityProgram {
	WebDriver driver;
	 @Test(priority=1)
	 void openapp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://community.blueprism.com/t5/Product-Forum/Application-Modeler-Dropdown-selection/td-p/50307");
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.manage().window().maximize();
	}

	 @Test(priority=2)
	 void details()
	{
		driver.findElement(By.xpath("//*[@id=\"loginPageV2_342275513888ba\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("SaviTest");
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("anythingTest123");
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		
	}
	
	 @Test(priority=3)
	 void logout()
	{
		driver.findElement(By.xpath("//*[@id=\"user-login-form\"]/div[5]/a")).click();
		System.out.print(driver.getCurrentUrl());
	}
}
