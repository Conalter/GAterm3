/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Me
 */
public class Selenium {
    
    private static WebDriver driver = null;
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        
        //maximize window
        driver.manage().window().maximize();
        
        //open browser with desried URL
        driver.get("https://www.google.com");
        
        //Applied wait time
        Thread.sleep(50000);

        //closing the browser
        driver.close();

    }
    
}
