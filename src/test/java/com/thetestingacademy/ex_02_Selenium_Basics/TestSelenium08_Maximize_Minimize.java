package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium08_Maximize_Minimize {

    @Description("Website window maximize")
    @Test
    public void test_maximize()
    {
        WebDriver driver = new FirefoxDriver();

        //get the url
        driver.get("https://google.com");



        //maximize the window
        driver.manage().window().maximize();
        //driver.manage().window().minimize();

        //close the browser
        driver.quit();

    }


}
