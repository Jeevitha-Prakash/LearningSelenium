package com.thetestingacademy.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.apache.logging.log4j.core.config.plugins.PluginLoggerContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project1 extends CommonToAll{


    @Description("TC#1 - Verify the particular text exist of kartalon website ")
    @Test
    public void test_verify_text()
    {

        // Open the URL
        // Get the source code
        // Verify the source Code
        
        WebDriver driver = new ChromeDriver();
        //driver.get("https://katalon-demo-cura.herokuapp.com/");
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com/");




        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            Assert.assertTrue(true);

        }
        else {
            System.out.println("TestCase Failed");
            Assert.assertTrue(false);
        }




        closeBrowser(driver);

    }
}
