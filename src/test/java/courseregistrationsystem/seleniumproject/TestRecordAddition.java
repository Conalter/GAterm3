/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.seleniumproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Me
 */
public class TestRecordAddition {
    public static void main(String[] args) throws InterruptedException {									
        String baseUrl = "https://prtapp.herokuapp.com/showNewEmployeeForm";					
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();				
        		
        driver.get(baseUrl);					
                
        //for (int i = 0; i<10000; i++){
        //driver.findElement(By.linkText("Add Employee")).click();
        driver.findElement(By.id("firstName")).sendKeys("Postman"); // increment matno							
        driver.findElement(By.id("lastName")).sendKeys("Pat");
        driver.findElement(By.id("email")).sendKeys("PM.Pat@RoyalMailEmail.com");
       
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("[type='submit']")).click();	
        //}
        
    }		
    
}
