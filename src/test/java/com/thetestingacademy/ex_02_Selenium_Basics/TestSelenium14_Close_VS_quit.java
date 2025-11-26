package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium14_Close_VS_quit extends CommonToAll{

    @Description("Understanding close() methods")
    @Test
    public void test_close1()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }
    @Description("Understanding quit() methods")
    @Test
    public void test_quit1()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.google.com");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }


}
