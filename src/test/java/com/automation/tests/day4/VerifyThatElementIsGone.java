package com.automation.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class VerifyThatElementIsGone {

    /*
    * Interview question
    * How to check if element doesn't exist anymore/or removed from HTML?
    *
    * */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(4000);

        driver.findElement(By.id("disappearing_button")).click();
        Thread.sleep(2000);

     //   if (driver.findElements(By.id("disappearing_button")).size()==0);{
            System.out.println("Test Passed");
       // }else{
         //   System.out.println("Test Failed");
        //}
        List<WebElement>list = driver.findElements(By.id("disappearing_button"));
        //if size is 0, means no elements were found.

        if(list.size()==0);{
            System.out.println("Test Failed");
//        }else {
            System.out.println("Test Failed");
        }


    }
}
