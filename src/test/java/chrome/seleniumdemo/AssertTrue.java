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

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 *
 * @author Me
 */
public class AssertTrue {
    
    public AssertTrue() {
    }
    
    /**
     * Test of main method, of class Selenium.
     */
    @Test
    public void testMain() {
        String expectedTitle = "Google";
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        assertTrue(expectedTitle.equals(driver.getTitle()));
    }
    
}
