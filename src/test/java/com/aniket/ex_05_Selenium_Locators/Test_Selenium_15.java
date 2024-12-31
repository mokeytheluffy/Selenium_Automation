package com.aniket.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_15 {

    @Description("Verify that with invalid email,pass,error message is shown on the app.vwo.com")
    @Test
    public void test_Negative_VWO_Login() throws Exception {

//EdgeOptions,ChromeOptions,SafariOptions, etc
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://app.vwo.com");

        //WebElement a_tag_start_trail = driver.findElement(By.linkText("Start a free trial")); // this linkText only works on anchor tag
       // a_tag_start_trail.click();
        /*
        <a
        href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        class="text-link"
        data-qa="bericafeqo">
        Start a free trial
        </a>
         */


        WebElement a_tag_start_trail_partial_match = driver.findElement(By.partialLinkText("free trial"));
        a_tag_start_trail_partial_match.click();
        Thread.sleep(5000);
        driver.quit();

    }
}
