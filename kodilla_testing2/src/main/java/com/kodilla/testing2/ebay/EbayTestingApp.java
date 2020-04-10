package com.kodilla.testin2.ebay;

import com.kodilla.testin2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.ebay.com/");

        WebElement webElement = webDriver.findElement(By.className("gh-tb"));
        webElement.sendKeys("Laptop");
        webElement.submit();
    }
}
