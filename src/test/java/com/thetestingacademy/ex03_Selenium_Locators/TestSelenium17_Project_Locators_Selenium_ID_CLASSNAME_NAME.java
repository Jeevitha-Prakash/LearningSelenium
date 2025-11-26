// Locators - Find the Web elements
// Open the URL https://app.vwo.com/#/login
// Find the Email id** and enter the email as **admin@admin.com**
// Find the Pass inputbox** and enter passwrod as **admin**.
// Find and Click on the submit button
// Verify that the error message is shown "Your email, password, IP address or location did not match"


package com.thetestingacademy.ex03_Selenium_Locators;

import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Project_Locators_Selenium_ID_CLASSNAME_NAME extends CommonToAll {
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pramod Dutta")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login()
    {
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://app.vwo.com");

        //inspect the textbox
        WebElement email_input_box = driver.findElement(By.id("login-username"));

        //Perform action
        email_input_box.sendKeys("admin@admin.com");

        //inspect the password box
        WebElement password_input_box = driver.findElement(By.name("password"));

        //perform action
        password_input_box.sendKeys("1234");

        //inspect submit button
        WebElement button_submit = driver.findElement(By.id("js-login-btn"));

        //Perform action
        button_submit.click();

        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement error_message = driver.findElement(By.className("notification-box-description"));

        //Perform action
        error_message.getText();

        //TestNG assertion to verify
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


        closeBrowser(driver);
    }


}
