package com.aniket.ex_08_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Selenium_25_Select {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element); // Select class allow to select the element
//        select.selectByVisibleText("Option 1");
          select.selectByIndex(2);
    }
}
