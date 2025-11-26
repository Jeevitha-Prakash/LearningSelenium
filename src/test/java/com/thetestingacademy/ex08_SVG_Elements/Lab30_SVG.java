package com.thetestingacademy.ex08_SVG_Elements;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab30_SVG extends CommonToAll
{
@Description("Verify that the on search with svg icon results are visible.")
@Severity(SeverityLevel.BLOCKER)
@Test
    public void test_Flipkart_search_svg_icon()
{
    WebDriver driver = new ChromeDriver();
    openBrowser(driver,"https://www.flipkart.com/");

    //inspect inputbox
    WebElement input_box = driver.findElement(By.name("q"));
    input_box.sendKeys("macmini");

    //inspect svg search
    List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
    svgElements.get(0).click();


    WaitHelpers waitHelpers = new WaitHelpers();
    waitHelpers.checkVisibility(driver,By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));


    //inspect the title of objects
   List<WebElement> macmini_title = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

for(WebElement title : macmini_title)
{
    System.out.println(title.getText());
}
    }
}
