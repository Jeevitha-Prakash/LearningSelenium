package com.thetestingacademy.ex_Alerts;

import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Alerts3 extends CommonToAll {

    @Description("Understanding Alerts")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_alerts3()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/javascript_alerts");

        WebElement Js_Alert_Button = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        Js_Alert_Button.click();

        //Switching driver on Alert
        Alert alert_box = driver.switchTo().alert();

        //action performing on alert
       alert_box.sendKeys("I am Jeevitha");

        alert_box.accept();


        closeBrowser(driver);




    }

}
