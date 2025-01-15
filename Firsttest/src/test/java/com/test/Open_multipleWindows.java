package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_multipleWindows {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://text-compare.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait up to 10 seconds
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("titleHeader")));
        
        //driver.switchTo().newWindow(WindowType.WINDOW);       //To switch to new Window
        
	    driver.switchTo().newWindow(WindowType.TAB);         //To switch to new Tab
        driver.get("https://demo.nopcommerce.com/");
        
	}

}
