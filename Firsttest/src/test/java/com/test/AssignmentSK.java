package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AssignmentSK {
		// TODO Auto-generated method stub
		public WebDriver driver;

	    @BeforeMethod

	    public void launchWeb() {
	        driver = new ChromeDriver();

	        driver.get("https://opensource-demo.orangehrmlive.com/web/");

	        driver.manage().window().maximize();

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @Test
	    
	    

	    public void demotesting() throws InterruptedException {
	    	
	    	 

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        WebElement user = driver.findElement(By.name("username"));

	        user.sendKeys("Admin");

	        driver.findElement(By.name("password")).sendKeys("admin123");

	        driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();

	        driver.findElement(By.xpath("//div[@class='oxd-topbar-body']//li[1]")).click();

	        Thread.sleep(3000);
	        WebElement leavetypeDropdown = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
	        leavetypeDropdown.click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        WebElement option = wait.until(ExpectedConditions.presenceOfElementLocated(
	        	    By.xpath("//div[@role='option']//span[contains(text(),'CAN - Personal')]")));
	        option.click();
	        Thread.sleep(2000);


	        JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	      WebElement fromdate = driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	      fromdate.sendKeys("2025-02-01");
	      Thread.sleep(2000);
	      
	      
	      WebElement toDate = driver.findElement(By.xpath("//form//div[2]/div[1]/div[2]/div[1]//div[2]//input[1]"));
	        js.executeScript("arguments[0].value='2025-02-01';", toDate);
	      Thread.sleep(2000); 
driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("Leave request due to health issues");
	   
WebElement	apply = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
apply.click(); 
	
    Thread.sleep(5000);
    

    try {
        // Wait for the toast to be visible
        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("oxd-toaster_1")));

        // Print the toast message text
        System.out.println("Toast message: " + toast.getText());

    } catch (Exception e) {
        System.out.println("Toast message not found.");
        e.printStackTrace();
      
       

    }
	    
	    }
	    
	    
	    
	    

     @AfterMethod

	    public void tearDown() {
	        driver.quit();
	    }
}




