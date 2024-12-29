package com.aniket.ex_04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Test_Selenium_12 {

    @Description("Option Class")
    @Test
    public void test_selenium_12() {

//EdgeOptions,ChromeOptions,SafariOptions, etc
        EdgeOptions options = new EdgeOptions();
        // EdgeOptions ----> it will help to set the browser

        //options.addArguments("--Window-size = 11280,720");
        //options.addArguments("--incognito"); // incognito mode does not work in Edge try using on Chrome
//        options.addArguments("--start-maximized");
       options.addArguments("--headless");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.google.com");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
