package com.aniket.ex_08_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_22 {

    @Description("Verify that with invalid email,pass,error message is shown on the app.vwo.com")
    @Test
    public void test_Negative_VWO_Login() throws Exception {

//EdgeOptions,ChromeOptions,SafariOptions, etc
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

       // Instead using thread.sleep use WebDrivweWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy ='closeModal']")));

WebElement closemodel = driver.findElement(By.xpath("//span[@data-cy ='closeModal']"));
closemodel.click();

try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    throw new RuntimeException(e);
}

        driver.quit();
    }
}
