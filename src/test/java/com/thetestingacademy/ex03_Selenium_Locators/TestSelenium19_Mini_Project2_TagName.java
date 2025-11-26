//You need to basically go to app.vwo.com,
//  then click on the "Start a Trial" button.
// Then you need to add an invalid email and verify,
//  and click on the radio box also. And then verify that the
//  "Create" button is not clickable and you get an error which is
//   "The email address you have entered is incorrect."



package com.thetestingacademy.ex03_Selenium_Locators;

import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_Mini_Project2_TagName extends CommonToAll {

    @Description("Verify that the error message comes with inavalid email id")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_free_trail_error_verify()
    {
        //Launching the fresh copy of browser
        WebDriver driver = new ChromeDriver();

        //Get the website login page
        openBrowser(driver, "https://app.vwo.com");

        //Find the webelement(since its an anchor tag/link, we can go with linkText and partialLinkText)
        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("Start a free trial"));

        //perform action
        a_tag_partial_match.click();

       try{
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       //Getting the url of the current page
        System.out.println(driver.getCurrentUrl());

        //verify the link is redirected to the correct page
        Assert.assertTrue(driver.getCurrentUrl().contains("/free-trial/"));

        //find email box
       WebElement email_text_box = driver.findElement(By.id("page-v1-step1-email"));

       //Perform actions
        email_text_box.sendKeys("abc.com");

        //find check box
        WebElement vwo_check_box = driver.findElement(By.name("gdpr_consent_checkbox"));

        //Perform actions
        vwo_check_box.click();

        //find element
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // <div  idx,namex, tagNAMEX,pt,lt-ax,
        // class="C(--color-red) Fz(--font-size-12) Trsp(--Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        //
        // </div>

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");




        closeBrowser(driver);





    }




}
