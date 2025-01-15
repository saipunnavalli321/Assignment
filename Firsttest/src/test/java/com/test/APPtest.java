package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class APPtest {

		// TODO Auto-generated method stub
		
		@Test
		
		public void test() 
		
		{
			
		WebDriver driver = new FirefoxDriver();	
			driver.get("https://www.youtube.com/");
			
			driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/form/input")).sendKeys("saikiran faltu you");
			driver.quit();

		}
		
	

}
	
