package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_11 {


    @Description("")
    @Test
    public void test_selenium04() throws Exception {

        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://katalon-demo-cura.herokuapp.com/"); // Open the URL // this is used 95%

        // Close --- will close the current time, not the session
        // here session id != 0
        Thread.sleep(3000);
        driver1.close();

// Quit --- will all the tabs
        // here session id == 0
        Thread.sleep(6000);
        driver1.quit();



    }

}