package com.thetestingacademy.ex_09_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab32_ActionClass {

    @Test
    public void test_actions() {
        WebDriver driver = new ChromeDriver();
        String URL = "https://awesomeqa.com/practice.html";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(firstname,"the testing academy").keyUp(Keys.SHIFT).build().perform();

    }
}
