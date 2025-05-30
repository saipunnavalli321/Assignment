package Jira_Tasks_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login {
	RemoteWebDriver driver;
	
	public void loginpage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/restaurants");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9591876407");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String otp = "231986";
        WebElement otpInput	= driver.findElement(By.xpath("//input[@id='otp']"));
        otpInput.sendKeys(otp);
		driver.findElement(By.xpath("//a[normalize-space()='VERIFY OTP']")).click();
	} 
	
	public void logoutpage()
{
	WebElement element	= driver.findElement(By.xpath("//span[@class='_2jyy2']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
 }
		@Test
		public void action() throws InterruptedException
		{
			loginpage();
		}
		
		@AfterTest
		public void action2()
		{
			logoutpage();
		}
	}


