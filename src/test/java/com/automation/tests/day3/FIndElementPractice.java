package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementPractice {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister twister");

        Thread.sleep(4000);

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");

        Thread.sleep(4000);

        WebElement signup = driver.findElement(By.name("wooden_spoon"));
        signup.submit();

        Thread.sleep(4000);

        String expected= "Thank you for signing up.Click the button below to return to homepage";
        WebElement message= driver.findElement(By.className("subheader"));

        String actual = message.getText();//to get the text <h3>Text</h3>

        if(expected.equals(actual)){
            System.out.println("Test Passed");
          }else{
            System.out.println("Test Failed!");
        }



        driver.quit();//to close website

    }
}
