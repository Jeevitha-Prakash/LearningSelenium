package com.thetestingacademy.ex_01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_OpenVWOLoginPage()
    {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }

}
