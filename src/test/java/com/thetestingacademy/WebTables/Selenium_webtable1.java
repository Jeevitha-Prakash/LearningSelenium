//which country google belong to
//Find 	Helen Bennett in which country


package com.thetestingacademy.WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_webtable1 {


    @Description("Understanding Webtables")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_webtable1()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable.html");

        //total rows
        int rows = driver.findElements(By.xpath("//table[contains(@id,\"customers\")]/tbody/tr")).size();

        //total columns
        int coloumns = driver.findElements(By.xpath("//table[contains(@id,\"customers\")]/tbody/tr[1]/th")).size();

        System.out.println(rows);
        System.out.println(coloumns);

        // //table[contains(@id,"customers")]/tbody/tr[i]/td[j]

        String first_path = "//table[contains(@id,\"customers\")]/tbody/tr[";
        String second_path = "]/td[";
                String third_path = "]";

        for(int i =2; i<=rows; i++)
        {
            for(int j =1; j<=coloumns; j++)
            {
              String dynamic_path = first_path+i+second_path+j+third_path;
              String data = driver.findElement(By.xpath(dynamic_path)).getText();
                //System.out.println(data);
                if(data.contains("Google"))
                {
                    String temp = dynamic_path+"/following-sibling::td[2]";
                    String country_google = driver.findElement(By.xpath(temp)).getText();
                    System.out.println("Google belongs to:  " +country_google);
                }

                if(data.contains("Helen Bennett"))
                {
                  String temp = dynamic_path+"/following-sibling::td";
                  String Helen_Bennett_country = driver.findElement(By.xpath(temp)).getText();
                    System.out.println(Helen_Bennett_country);
                }
            }

        }

    }





}
