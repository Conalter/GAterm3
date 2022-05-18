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
        String expectedTitle = "Google1";
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");       
        assertFalse(expectedTitle.equals(driver.getTitle()));
        
        driver.close();
    }
    
}
