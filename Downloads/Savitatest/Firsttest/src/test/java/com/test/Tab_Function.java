package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Function {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
         List<String> ids = new ArrayList (driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
 driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Savita");
 Thread.sleep(2000);
 driver.switchTo().window(ids.get(0));
 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Electronics");
	}

}
