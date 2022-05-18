/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.seleniumproject;

import static org.testng.Assert.assertFalse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * @author Me
 */
public class AssertFalse {
    
    public AssertFalse() {
    }
    
    /**
     * Test of main method, of class Selenium.
     */
    @Test
    public void testMain() {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver88\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://localhost:4200/courseregistration");  
        Boolean verifyTitle = browser.getTitle().equalsIgnoreCase("CRSClient_Registration");
        assertFalse(verifyTitle);
    }
    
}
