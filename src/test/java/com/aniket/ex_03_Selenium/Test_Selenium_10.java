package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_10 {


    @Description("")
    @Test
    public void test_selenium04() throws Exception {

        WebDriver driver1 = new EdgeDriver();
        driver1.get("google.com/"); // https or http is required ---- it is manditory



    }

}