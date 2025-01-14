package com.aniket.ex_08_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class Test_Selenium_23_FluentWay {

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
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy ='closeModal']")));

        // Fluent Syntax
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);

        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("notification-box-description"));
            }
        });

        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        driver.quit();
    }
}
