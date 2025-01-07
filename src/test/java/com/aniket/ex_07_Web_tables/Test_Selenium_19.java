package com.aniket.ex_07_Web_tables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_19 {
    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test() throws Exception {
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(option);
        driver.get("https://www.flipkart.com/");

driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgElements = driver.findElements(By.tagName("svg"));
svgElements.get(0).click();
    }
}
