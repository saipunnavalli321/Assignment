package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestAlerts {

	@Test
	public void alert() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		 Thread.sleep(2000);
		//Actions action = new Actions("https://demo.automationtesting.in/Alerts.html");
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
			 Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
             Alert alr =  driver.switchTo().alert();
             alr.sendKeys("Savii");
             alr.accept();
			
			
			
			
	}
      
	

}
