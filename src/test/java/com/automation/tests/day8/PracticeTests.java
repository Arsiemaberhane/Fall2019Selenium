package com.automation.tests.day8;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTests {
//    private class PracticeTests {
        private WebDriver driver;
        // We put @Test annotation to make methods executable as tests.

        @Test
        public void loginTest(){
            driver.findElement(By.linkText("Form Authentication")).click();
            BrowserUtils.wait(3);
            }

        @BeforeMethod
        public void setup(){
            WebDriverManager.chromedriver().version("79").setup();


        }
    }

