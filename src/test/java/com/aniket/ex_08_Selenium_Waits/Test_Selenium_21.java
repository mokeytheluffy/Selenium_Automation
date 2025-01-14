package com.aniket.ex_08_Selenium_Waits;


import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_21 {

    @Description("Verify that with invalid email,pass,error message is shown on the app.vwo.com")
    @Test
    public void test_Negative_VWO_Login() throws Exception {

//EdgeOptions,ChromeOptions,SafariOptions, etc
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://app.vwo.com");


        WebElement EmailInputClass = driver.findElement(By.id("login-username"));
        EmailInputClass.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

WebElement button =driver.findElement(By.id("js-login-btn"));
button.click();
// Thread.sleep(3000);------ avoid using waits instead use wait


        WebElement error_message = driver.findElement(By.className("notification-box-description"));
       // Instead using thread.sleep use WebDrivweWait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(10000);
        driver.quit();
    }
}
