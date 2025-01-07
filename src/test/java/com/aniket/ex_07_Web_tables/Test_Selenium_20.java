package com.aniket.ex_07_Web_tables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_20 {
    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test() throws Exception {
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(option);
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        List<WebElement> state = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for( WebElement element : state ) {
            System.out.println(element.getAttribute("aria-label"));
            if (element.getAttribute("aria-label").contains("Goa")){
                element.click();
            }
        }
        state.get(0).click();
    }
}
