package com.test;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {

		// TODO Auto-generated method stub
		@Test
		
		public void test() throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://community.blueprism.com/t5/Product-Forum/Application-Modeler-Dropdown-selection/td-p/50307");
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			WebElement var = driver.findElement(By.name("searchGranularity"));
			Select var2 = new Select(var);
			var2.selectByIndex(1);
			Thread.sleep(2000);
			var2.selectByVisibleText("Knowledge base");
			Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");		
			driver.close();
		
		}
          

	}


