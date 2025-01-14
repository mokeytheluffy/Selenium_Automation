package com.aniket.ex_08_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Selenium_24_InputBox_CheckBox_RadioButton {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        driver.findElement(By.name("firstname")).sendKeys("Aniket");
// RADIO button
        driver.findElement(By.id("sex-1")).click();

// Check button
        driver.findElement(By.id("tool-1")).click();

    }
}
