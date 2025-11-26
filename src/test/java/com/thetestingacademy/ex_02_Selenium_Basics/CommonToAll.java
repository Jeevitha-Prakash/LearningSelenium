package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll {

    public ChromeDriver driver;

    public void openBrowser(WebDriver driver, String url)
    {
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void closeBrowser(WebDriver driver)
    {

        driver.quit();
    }

    public void sleep()
    {
        try
        {
            Thread.sleep(3000);
    } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void waitForVisibility(WebDriver driver, int timeInSeconds, String xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));

    }

    public void waitForTextToBePresent(WebDriver driver, int timeInSeconds, String xpath, String text)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath(xpath)),text));

    }

}
