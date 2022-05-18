/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseregistrationsystem.seleniumproject;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Me
 */
public class ViewListOfEmployees {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://prtapp.herokuapp.com/showNewEmployeeForm";
        String endUrl = "https://livethreatmap.radware.com/";
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        String searchValue = "ZS.@Zmail.com";
        String firstName = "Zavid";
        String originalLastName = "Shmith";

        //new name
        String newLastName = "Smith";

        Thread.sleep(2000);

        //insert details & submit
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(originalLastName);
        driver.findElement(By.id("email")).sendKeys(searchValue);
        driver.findElement(By.cssSelector("[type='submit']")).click();

        Thread.sleep(2000);

        int row = 0;
        int foundRow = 0;

        //find correct details
        List<WebElement> element = driver.findElements(By.cssSelector("tr"));

        for (WebElement w : element) {
            String elemText = w.getText();
            if (elemText.contains(searchValue)) {
                foundRow = row;
                break;
            }
            row++;
        }

        Thread.sleep(3000);

        driver.findElement(By.xpath("//table/tbody/tr[" + foundRow + "]/td[4]/a[1]")).click();

        driver.findElement(By.id("lastName")).clear();

        driver.findElement(By.id("lastName")).sendKeys(newLastName);

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[type='submit']")).click();

        Thread.sleep(2000);

        driver.get(endUrl);
    }
}
