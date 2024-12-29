package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_09 {


    @Description("")
    @Test
    public void test_selenium04() throws Exception {

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://katalon-demo-cura.herokuapp.com/"); // Open the URL // this is used 95%

        //navigation module

        driver1.navigate().to("https://www.google.com/"); // rarely used
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().refresh();


    }

}