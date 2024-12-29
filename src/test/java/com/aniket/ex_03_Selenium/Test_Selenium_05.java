package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Selenium_05 {


    @Description("")
    @Test
    public void test_selenium04() {

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
        driver1.get("https://www.google.com");

    }

}
