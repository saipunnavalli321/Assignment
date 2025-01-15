package com.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		 List<WebElement> check = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		for(int i=0; i<check.size(); i++)
		{
			check.get(i).click();
		}

	}

}
