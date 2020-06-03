//百度搜索Selenium
package org.example;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    public void searchSelenium()
    {
        // System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        //指定要调用的WebDriver,也可以用Chrome
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("selenium");
        driver.findElement(By.id("su")).click();
        driver.quit();
    }
}