package com.automation.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    //YOUR HOMEWORK WILL BE TO IMPROVE THIS METHOD.
    /** This method return webdriver object based on browser type.
     * if you want to use chrome browser, just provide chrome as a parameter.
     * @param browserName
     * @return Webdriver object.
     * **/

    public static WebDriver createADriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else{WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
       }
        WebDriver driver = DriverFactory.createADriver("chrome");



    }
}
