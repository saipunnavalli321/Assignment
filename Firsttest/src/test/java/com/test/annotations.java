package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class annotations {

    WebDriver driver;

    public void loginpage() {
        
        driver = new FirefoxDriver();    
        driver.get("https://www.youtube.com/");
        driver.findElement(By.className("yt-spec-touch-feedback-shape__fill")).click();
    }

    @Test
    public void testLoginPage() 
    {
        loginpage();  
    }

    @AfterTest
    public void tearDown() 
    {
        if (driver != null) 
        {
            driver.quit(); 
        }
    }
}
