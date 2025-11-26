package com.thetestingacademy.ex08_SVG_Elements;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab31_SVG_MAP extends CommonToAll {

    @Description("Verify Tripura is present in the map and click to zoom it")
    @Test
    public void test_India_Map_svg()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.amcharts.com/svg-maps/?map=india");

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitJVM(3000);

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for(WebElement state: states){
            System.out.println(state.getDomAttribute("aria-label"));
            if(state.getDomAttribute("aria-label").contains("Tripura")){
                state.click();
            }
        }



        waitHelpers.waitJVM(3000);
        driver.quit();



    }

    }


