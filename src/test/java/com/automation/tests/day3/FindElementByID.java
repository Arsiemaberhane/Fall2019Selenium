package com.automation.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("htt[://practice.cybertekschool.com/login");

        driver.findElement(By.name("username")).sendKeys("tomsmith");

        Thread.sleep(3000);

        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(3000);
        String expected = "Welcome to the secure area";
        String actual = driver.findElement(By.tagName("h4")).getText();

        if (expected.equals(actual)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        //Let's click on logout button. It looks like abutton, but it's actually a link.
        //Every element with <a> tag is a link.

        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
        Thread.sleep(2000);

        driver.quit();



    }
}
