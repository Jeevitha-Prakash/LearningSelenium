package com.thetestingacademy.WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium_orangehrm {

    @Description("Understanding Webtables")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_webtable2() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");

        driver.manage().window().maximize();

        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();




       int a1 = driver.findElements(By.xpath("//div[@class=\"oxd-table-body\"]/child::div")).size();
        System.out.println(a1);
        //int rows = driver.findElements(By.xpath("//div[@class=\"orangehrm-container\"]/div/div[@class=\"oxd-table-body\"]/child::div")).size();
        //System.out.println(rows);
    }

}
