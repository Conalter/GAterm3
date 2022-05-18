/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chrome.seleniumdemo;

/**
 *
 * @author Me
 */

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
    public void testMain() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.google.co.uk"); 
        String ActualTitle = browser.getTitle();
        
        //Applied wait time
        browser.manage().timeouts().implicitlyWait(Duration.ZERO);   
        
        //maximize window
        browser.manage().window().maximize();

        String ExpectedTitle = "Google";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        
        //Applied wait time
        Thread.sleep(50000);
        
        browser.close();
        
    }
    
}
