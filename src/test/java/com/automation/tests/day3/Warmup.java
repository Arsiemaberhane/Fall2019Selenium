package com.automation.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Warmup {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ebayTest();
       amazonTest();
       wickipediaTest();

    }

public static void ebayTest(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://ebay.com");
    driver.findElement(By.id("gh-ac")).sendKeys("java book");
    driver.findElement(By.id("gh-btn")).click();
    WebElement searchResults = driver.findElement(By.tagName("h1"));
    System.out.println(searchResults.getText().split(" ")[0]);
    //String[] searchSentence = searchResults.
    driver.quit();


}
public static void amazonTest() {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("http://amazon.com");
    //enter text and click enter
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
    String title = driver.getTitle();
    if(title.contains("java book")){
        System.out.println("Test Passed");
    }else {
        System.out.println("Test Failed");
    }
    driver.quit();



}

public static void wickipediaTest() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    //Go to wikipedia.org
    driver.get("https://en.wikipedia.org/wiki/Main_Page");
    //enter search term `selenium webdriver` & click on search button
    driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.RETURN);

    Thread.sleep(3000);
    //click on search result `Selenium (software)`
    driver.findElement(By.partialLinkText("Selenium (software)")).click();
    Thread.sleep(2000);
    String link = driver.getCurrentUrl(); // to get link as a String
    //verify url ends with `Selenium_(software)`
    if(link.endsWith("Selenium_(software)")){
        System.out.println("TEST PASSED");
    }else {
        System.out.println("TEST FAILED");
    }
    driver.quit();

}
}