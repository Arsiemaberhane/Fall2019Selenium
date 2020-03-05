//package com.automation.tests.day2;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class seleniumHO2 {
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://automationpractice.com");
//        WebElement search_box = driver.findElement(By.id("search_query_top"));
//
//        search_box.sendKeys("tshirt"+ Keys.ENTER);
//
//
//        WebElement error = driver.findElement(By.xpath("xpath = //p[@class=‘alert alert-warning’]"));
//        String errorText = error.getText();
//        //.getText---->returns String (Text) from the element.
//        search_box=driver.findElement(By.id("search_query_top"));
//        //search_box
//
//        System.out.println("Error Message: " + errorText);
//        //NoSuchElementException - Means we could not locate element.
//        search_box.sendKeys("t-shirt"+Keys.ENTER);
//        //StaleElementRefernceException - element is old/stale-we want to find
//        //this element again or refresh page.
//        try{
//            Thread.sleep(2000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        WebElement count = driver.findElement(By.className("product-count"));
//        System.out.println("items found: " + count.getText());
//
//
//        driver.quit();
//        //in HTML a- stands for a link.
//        //span stands for description
//
//        WebElement addToCart = driver.findElement(By.className("button ajax_add_to_"))
//
//
//
//
//    }
//
//}
