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

public class TestSelenium24_MiniProject4 extends CommonToAll {
    @Description("Verify  makemytrip opens with modal")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_makemytrip()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");

        waitForVisibility(driver,5,"//span[@data-cy=\\\"closeModal\\\"]");
        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();


        closeBrowser(driver);
    }

}
