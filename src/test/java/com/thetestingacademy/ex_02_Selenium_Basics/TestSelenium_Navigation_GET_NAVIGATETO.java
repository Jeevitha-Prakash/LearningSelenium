package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Navigation_GET_NAVIGATETO extends CommonToAll {

    @Description("Open the url")
    @Test
    public void test_navigation()
    {
        WebDriver driver = new ChromeDriver();

        openBrowser(driver, "https://google.com");

        driver.navigate().to("https://bing.com");

        System.out.println("bing");
        driver.navigate().back();
        System.out.println("back");
        driver.navigate().forward();
        System.out.println("forward");
        driver.navigate().refresh();
        System.out.println("refresh");

        closeBrowser(driver);


    }
}
