package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/";
    public static final String XPATH_DAY = "select[1]";
    public static final String XPATH_MONTH = "select[2]";
    public static final String XPATH_YEAR = "select[3]";
    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com/");

        while(!webDriver.findElement(By.xpath(XPATH_SELECT+""+XPATH_DAY)).isDisplayed());

        WebElement dayField = webDriver.findElement(By.xpath(XPATH_SELECT+""+XPATH_DAY));
        Select selectDay = new Select(dayField);
        selectDay.selectByIndex(11);

        WebElement monthField = webDriver.findElement(By.xpath(XPATH_SELECT+""+XPATH_MONTH));
        Select selectMonth = new Select(monthField);
        selectMonth.selectByIndex(12);

        WebElement yearField = webDriver.findElement(By.xpath(XPATH_SELECT+""+XPATH_YEAR));
        Select selectYear = new Select(yearField);
        selectYear.selectByIndex(13);


    }
}
