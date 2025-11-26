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

public class TestSelenium20_MiniProject extends CommonToAll {

    @Description("Verify the successfull login of awesomeqa.com ")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void verify_login_page_awesomeqa()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/hr/web/index.php/auth/login");

        WebElement textbox_username = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        WebElement textbox_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button_login = driver.findElement(By.xpath("//button[normalize-space() = \"Login\"]"));

        textbox_username.sendKeys("admin");
        textbox_password.sendKeys("Hacker@4321");
        button_login.click();




        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));

        //Verifying the login is successfull
        Assert.assertEquals(h6.getText(),"PIM");



        closeBrowser(driver);



    }
}


//input[@name="username"]
//input[@name="password"]
//button[contains(text(),"Login")]

//h2[contains(text(),"Make Appointment")]