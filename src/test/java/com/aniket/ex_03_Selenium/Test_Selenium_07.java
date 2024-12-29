package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_07 {


    @Description("")
    @Test
    public void test_selenium04() {

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.google.com"); // Open the URL


        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        System.out.println(driver1.getPageSource());

driver1.manage().window().maximize(); // This will maximize the screen
        driver1.manage().window().minimize();// this will minimize the screen


        Assert.assertEquals(driver1.getTitle(), "Google");



    }

}