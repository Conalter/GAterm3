/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.seleniumproject;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/**
 *
 * @author Me
 */
public class AssertEquals {
    
    public AssertEquals() {
    }
    
    /**
     * Test of main method, of class Selenium.
     */
    @Test
    public void testMain() {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver88\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://localhost:4200/courseregistration"); 
        String ActualTitle = browser.getTitle();
        
        //Applied wait time
        browser.manage().timeouts().implicitlyWait(Duration.ZERO);   //.implicitlyWait(10, TimeUnit.SECONDS);
        
        //maximize window
        browser.manage().window().maximize();

        System.out.println("Application title: " + ActualTitle);
        String ExpectedTitle = "CRSClient";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
    
}
