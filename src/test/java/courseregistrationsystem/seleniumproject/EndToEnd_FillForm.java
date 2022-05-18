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
public class EndToEnd_FillForm {
    public static void main(String[] args) throws InterruptedException {									
        String baseUrl = "https://prtapp.herokuapp.com/";					
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver88\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();				
        		
        driver.get(baseUrl);					
                
        //for (int i = 0; i<10000; i++){
        driver.findElement(By.linkText("Add Course Registration")).click();
        driver.findElement(By.id("matno")).sendKeys("UD01"); // increment matno							
        driver.findElement(By.id("coursecode")).sendKeys("GA02");
        driver.findElement(By.id("term")).sendKeys("3");
        driver.findElement(By.id("academicsession")).sendKeys("2077");
       
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("[type='submit']")).click();	
        //}
        
    }		
    
}
