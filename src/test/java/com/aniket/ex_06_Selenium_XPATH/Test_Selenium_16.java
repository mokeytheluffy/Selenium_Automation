package com.aniket.ex_06_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Test_Selenium_16 {
    public static void main(String[] args) {

    }
    public void Test() throws Exception {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com");


        WebElement Make_appointment = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
    Make_appointment.click();
    }
}
