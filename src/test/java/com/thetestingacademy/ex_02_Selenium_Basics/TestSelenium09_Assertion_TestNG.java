package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium09_Assertion_TestNG {

    @Description("Open the URL and verify it")
    @Test
    public void test_get_verify_currentURL()
    {
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        //TestNG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");

        //AssertJ
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");



    }
}
