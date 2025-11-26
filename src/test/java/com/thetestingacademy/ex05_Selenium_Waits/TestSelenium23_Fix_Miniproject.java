package com.thetestingacademy.ex05_Selenium_Waits;

import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_Fix_Miniproject extends CommonToAll {

    // Locators - Find the Web elements
    // Open the URL .app.vwo.com/#/login](https://app.vwo.com/#/login)
    //Find the Email id** and enter the email as admin@admin.com
    //Find the pass inputbox** and enter passwrod as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void testVwoLoginNegative() {

        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://app.vwo.com/#/login");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("admin");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds('3'));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id=\"js-login-btn\"]")));

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
        driver.quit();


    }
}
