package com.aniket.ex_08_Selenium_Waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Test_Selenium_26_Alerts {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

       //----1----//button[@onclick='jsAlert()']
    //----2----//button[@onclick='jsConfirm()']
//----3----//button[@onclick='jsPrompt()']
        WebElement button_1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        WebElement button_2 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        WebElement button_3 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

/*      String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You successfully clicked an alert");
        button_1.click();

        // Using of Alert Class
        Alert alert = driver.switchTo().alert();
        alert.accept(); // this will help to click OK button in alert pop-up window
*/

 /*       button_2.click();

        // Using of Alert Class
        Alert alert = driver.switchTo().alert();
        alert.accept(); // this will help to click OK button in alert pop-up window
        alert.dismiss();// this will help to click Cancel button in alert pop-up window
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You clicked : Ok");
*/

        button_3.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        // Using of Alert Class
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("ANIKET");
        alert.accept(); // this will help to click OK button in alert pop-up window



        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result,"You clicked : ANIKET");


    }
}
