package com.automation.tests.Assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://Amazon.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        Thread.sleep(4000);

        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
        driver.navigate().back();
        Thread.sleep(4000);//for demo, wait 3 seconds

        driver.quit();
    }
}
