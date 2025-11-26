package com.thetestingacademy.ex_09_Action_Class;

import com.thetestingacademy.ex07_WaitHelper.WaitHelpers;
import com.thetestingacademy.ex_02_Selenium_Basics.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class lab34_ActionClass extends CommonToAll {

    @Test
    public void test_makemytrip_dropdown_verify()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");



        WaitHelpers wait = new WaitHelpers();
        wait.checkVisibility(driver,By.xpath("//span[@data-cy='closeModal']"));

        WebElement modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        modal.click();

        Actions action = new Actions(driver);


        wait.waitJVM(3000);

        WebElement departure_city = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));
        action.moveToElement(departure_city).click().sendKeys("IXC").build().perform();
        wait.waitJVM(3000);

        List<WebElement> autosuggestion_list = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        for(WebElement e : autosuggestion_list)
        {
           if(e.getText().contains("Chandigarha"))
           {
               e.click();
           }
        }

        //actions.moveToElement(toCity).click().sendKeys("DEL").build().perform();
//
//        try {
//            List<WebElement> list_auto_complete=  driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//            for(WebElement e : list_auto_complete){
//                if(e.getText().contains("Del")){
//                    e.click();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


    }



    }

