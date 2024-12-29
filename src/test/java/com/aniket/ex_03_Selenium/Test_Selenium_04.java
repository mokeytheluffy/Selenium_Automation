package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test_Selenium_04 {


    @Description("")
    @Test
    public void test_selenium04() {
// Webdriver herarchy
        //SearchContext(I)---->2---> webdriver(C)--->10
        // the more bottom we go count goes on increase
        //SearchContext(I)
        //Webdriver(I)
        //RemoteWebDriver(C)
        //ChromiumWebDriver(C)
        //ChromeDriver(C)

        //by using dynamic dispatch
        //SearchContext driver = new ChromeDriver();
        //WebDriver driver1 = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();


        // 1. Do u want to run on Chrome or Edge
        //ChromeDriver driver = new ChromeDriver(); ----- 1% used

        // 2. Do u want to run on Chrome than change to edge
        //WebDriver driver1 = new ChromeDriver();  ----- 97% used


        // 3. do u want to run on multiple browsers
        // RemoteWebDriver driver = new ChromeDriver();  ----- 2% used




        //findelement/findelements
    }

}
