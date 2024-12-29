package com.aniket.ex_04_Selenium_Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Test_Selenium_13_Add_Extension {

    @Description("Option Class")
    @Test
    public void test_selenium_12() {

//EdgeOptions,ChromeOptions,SafariOptions, etc
        EdgeOptions options = new EdgeOptions();
        // EdgeOptions ----> it will help to set the browser
        options.addArguments("--Window-size = 1280,720");
options.addExtensions(new File("here we have to mention path of the extension which is download in your sysytem in zip or CRX format"));
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
