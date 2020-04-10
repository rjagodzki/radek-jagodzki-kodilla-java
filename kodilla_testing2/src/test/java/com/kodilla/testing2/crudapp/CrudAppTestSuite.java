package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL = "https://rjagodzki.github.io/";
    private WebDriver driver;
    private Random generator;
    private static int numberOfTask;

    public void setNumberOfTask(int numberOfTask) {
        this.numberOfTask = numberOfTask;
    }

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException{
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();

        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//form[@class=\"datatable__row\"]"));

        setNumberOfTask(elements.size());
        System.out.println("Number of tasks: " + numberOfTask);


        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException{
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTestExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL="https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("jagodzki.radek@outlook.com");
        Thread.sleep(2000);
        driverTrello.findElement(By.id("login")).submit();
        Thread.sleep(2000);
        driverTrello.findElement(By.id("password")).sendKeys("password");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(5000);

        driverTrello.findElement(By.xpath(".//div[@title=\"Kodilla\"]")).click();

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size()>0;

        driverTrello.close();

        return result;
    }

    public int checkTestDeleteFromCrudApp(String taskName) throws InterruptedException{
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath(("//select[1]"))).isDisplayed()) ;

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
               .filter(value -> value.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]")).getText().equals(taskName))
               .forEach(button -> {
                   WebElement deleteButton = button.findElement(By.xpath(".//fieldset[contains(@class, \"row-section--button-section\")]/button[4]"));
                   deleteButton.click();
               });
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//form[@class=\"datatable__row\"]"));

        return elements.size();
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskname = createCrudAppTestTask();
        sendTestTaskToTrello(taskname);
        assertTrue(checkTestExistsInTrello(taskname));
        assertEquals(numberOfTask - 1, checkTestDeleteFromCrudApp(taskname));
    }

}
