package com.test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		//File trgfile = new File("C:\\Users\\Savita\\Downloads\\Savitatest\\Firsttest\\ScreenshotFile\\fullpage");
		File trgfile = new File(System.getProperty("user.dir")+"\\ScreenshotFile\\\\fullpage");
		srcfile.renameTo(trgfile);
		driver.quit();

	}

}
