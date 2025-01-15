package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_zeninbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://staging.zeninbox.ai/sign-in?redirect_url=https%3A%2F%2Flocalhost%3A8080%2Fconversation%2Finbox");
        driver.findElement(By.xpath("//button[normalize-space()='Sign Up with Google']")).click();
        driver.findElement(By.xpath("//div[normalize-space()='savimg9507@gmail.com']")).click();
        driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Renu12345");
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		
	}
}
