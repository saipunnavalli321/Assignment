package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_zeninbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://staging.zeninbox.ai/sign-in?redirect_url=https%3A%2F%2Flocalhost%3A8080%2Fconversation%2Finbox");
		driver.findElement(By.xpath("//a[normalize-space()='Try for free']")).click();
		driver.findElement(By.xpath("//input[@placeholder='e.g. John']")).sendKeys("Savi");
		driver.findElement(By.xpath("//input[@placeholder='e.g. Doe']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@placeholder='johnDoe@gmail.com']")).sendKeys("savimg9507@gmail.com");
		driver.findElement(By.xpath("//input[@data-rr-is-password='true']")).sendKeys("TestSavi12345");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("TestSavi12345");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
