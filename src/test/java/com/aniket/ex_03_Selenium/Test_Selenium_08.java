package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_08 {


    @Description("")
    @Test
    public void test_selenium04() throws Exception {

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://katalon-demo-cura.herokuapp.com/"); // Open the URL
        driver1.manage().window().maximize();

        if (driver1.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is visible");
            Assert.assertTrue(true);
        }else {
            throw new Exception("CURA Healthcare Service is not Visible");
        }


    }

}