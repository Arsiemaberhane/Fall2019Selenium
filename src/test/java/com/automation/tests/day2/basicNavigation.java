package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //To start selenium setup we need
        //setup web driver (browser driver) and create
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); //

        driver.get("http://google.com");// to open website
        Thread.sleep(3000); //for demo, wait for 3 seconds
        //
                String title = driver.getTitle(); //returns <title> some title </title> text
        String expectedTitle = "google";
        System.out.println("Title is ..." + title);

        if (expectedTitle.equals(title)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        //
        driver.close();




    }
}
