//百度搜索Selenium
package org.example;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    WebDriver driver;
    SetUp setup = new SetUp();
    Functions functions = new Functions();

    @Parameters({"browser","url"})
    @BeforeTest
    public void beforeTest(String browser, String url)
    {
        driver = setup.beforeTest(browser,url);
    }

    @Test(priority = 2)
    public void searchSelenium()
    {
        functions.searchText(driver,"selenium");
        System.out.println("Thread id is " + Thread.currentThread().getId());
//打印出方法所在线程id
    }

    @Test(priority = 1)
    public void searchJava()
    {
        functions.searchText(driver,"java");
        System.out.println("Thread id is " + Thread.currentThread().getId());
//打印出方法所在线程id
    }

    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }
}