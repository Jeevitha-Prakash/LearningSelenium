package com.thetestingacademy.ex05_Selenium_Waits;

import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium22_Waits extends CommonToAll {

    @Description("Verifying successful login of app.vwo.com website")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_app_implicit_wait()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com");

        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);



        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("abc.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("1233");


        WebElement link = driver.findElement(By.linkText("Start a free trial"));
        link.click();



    }
}
