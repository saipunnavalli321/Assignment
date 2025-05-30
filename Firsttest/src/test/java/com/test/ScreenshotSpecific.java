package com.test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSpecific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		 WebElement ts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		 File srcFile = ts.getScreenshotAs(OutputType.FILE);
		 File trgFile = new File("C:\\Users\\Savita\\Downloads\\Savitatest\\Firsttest\\ScreenshotFile\\specificpage.png");
		 srcFile.renameTo(trgFile);
		 driver.quit();
		 
	}

}
