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

import java.util.List;


import static java.lang.Thread.sleep;

public class TestSelenium21_MiniProject_3 extends CommonToAll {

    @Description("Verify the successfull login of katalon.com ")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void verify_login_page_awesomeqa() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com/");
        sleep();

        WebElement make_appt_link = driver.findElement(By.xpath("//a[contains(text(),\"Make Appointment\")]"));
        make_appt_link.click();

        //Verify the login url
        Assert.assertTrue(driver.getCurrentUrl().contains("#login"));

        sleep();

        //WebElement textbox_username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        // WebElement textbox_password = driver.findElement(By.xpath("//input[@name=\"password\"]"));

        List<WebElement> textbox_username = driver.findElements(By.xpath("//input[@placeholder = \"Username\"]"));
        List<WebElement> textbox_password = driver.findElements(By.xpath("//input[@placeholder = \"Password\"]"));
        WebElement button_login = driver.findElement(By.xpath("//button[contains(text(),\"Login\")]"));

        textbox_username.get(1).sendKeys("John Doe");
        sleep();
        textbox_password.get(1).sendKeys("ThisIsNotAPassword");

        sleep();
        button_login.click();

        sleep();


        WebElement make_appointment_text = driver.findElement(By.xpath("//h2[contains(text(),\"Make Appointment\")]"));

        //Verifying the login is successfull
        Assert.assertEquals(make_appointment_text.getText(),"Make Appointment");

        sleep();

        closeBrowser(driver);


    }
}
