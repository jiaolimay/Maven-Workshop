package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUp {
    WebDriver driver;

    public WebDriver beforeTest(String browser, String url)
    {
        // System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        //指定要调用的WebDriver,也可以用Chrome
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("can't supply such browser.");
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
