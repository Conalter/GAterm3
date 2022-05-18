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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * @author Me
 */
public class AssertNotNull {
    
    public AssertNotNull() {
    }
    
    /**
     * Test of main method, of class Selenium.
     */
    @Test
    public void testMain() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        assertNotNull(driver); 
    }
    
}
