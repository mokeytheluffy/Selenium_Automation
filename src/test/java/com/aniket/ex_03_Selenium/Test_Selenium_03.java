package com.aniket.ex_03_Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_03 {


    @Description("")
    @Test
    public void test_selenium03() {
// Selenium 3 --- you need to set up the browser driver
      //  System.getProperty("webdriver.gecko.driver", "/path/geckodriver");

// Selenium 4
        // Selenium Manager ---- utility --- which can download the driver automatically
        //start and stop itself

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
    }

}
