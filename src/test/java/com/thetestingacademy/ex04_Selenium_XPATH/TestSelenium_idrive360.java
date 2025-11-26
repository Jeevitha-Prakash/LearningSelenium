package com.thetestingacademy.ex04_Selenium_XPATH;

import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_idrive360 extends CommonToAll {

    @Description("Verify that the idrive expiry message is displaying after logging into idrive website")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_idrive360_expirymsgverify()
    {
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://www.idrive360.com/enterprise/login");



        WebElement idrive_username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        WebElement idrive_password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        WebElement idrive_signin = driver.findElement(By.xpath("//button[text()=\"Sign in\"]"));

        idrive_username.sendKeys("augtest_040823@idrive.com");

        idrive_password.sendKeys("123456");

        idrive_signin.click();



        WebElement expiry_msg = driver.findElement(By.xpath("//button[contains(text(),\"Upgrade Now!\")]"));

        System.out.println(expiry_msg);
        Assert.assertTrue(expiry_msg.getText().contains("Upgrade Now!"));



        closeBrowser(driver);


    }


}
