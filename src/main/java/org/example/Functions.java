package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Functions {

    public By _searchBox = By.id("kw");
    public By _searchButton = By.id("su");

    public void searchText(WebDriver driver, String text)
    {
        driver.findElement(_searchBox).clear();
        driver.findElement(_searchBox).sendKeys(text);
        driver.findElement(_searchButton).click();
    }

}
