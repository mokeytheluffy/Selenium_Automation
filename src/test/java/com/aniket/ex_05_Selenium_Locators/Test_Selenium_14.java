package com.aniket.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_14 {

    @Description("Verify that with invalid email,pass,error message is shown on the app.vwo.com")
    @Test
    public void test_Negative_VWO_Login() throws Exception {

//EdgeOptions,ChromeOptions,SafariOptions, etc
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(options);
        driver.get("https://app.vwo.com");


        // 1. Find the Email input box and enter the Email.

        /*<input -- open html tag
        type = "email" ---- Keys and values (Attributes)
        class="text-input W(100%)"
        name = "username"
        id = "login-username"
        data - qa = "hocewoqisi"
        > --- Close html tag
         */
        // 2. Find the password  input box and enter the password.
        // 3. Find the submit button --action --- click on it
        // 4. Find the invalid error message and verify.

        // 1. Find the Email input box and enter the Email.
        WebElement EmailInputClass = driver.findElement(By.id("login-username"));
        EmailInputClass.sendKeys("admin@admin.com");



        // 2. Find the password  input box and enter the password.

/*<input
 type="password"
 class="text-input W(100%)"
 name="password"
 id="login-password" -- we can use this but incase there is no unique Id present then name will be used
 data-qa="jobodapuxe"
 >
*/

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");


        // 3. Find the submit button --action --- click on it
/*<button
type="submit"
id="js-login-btn"
class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
onclick="login.login(event)"
data-qa="sibequkica"
>
 */
WebElement button =driver.findElement(By.id("js-login-btn"));
button.click();
Thread.sleep(3000); // after click error message wont get displayed in next second this takes times so, by using sleep time it will wait until the error message appears on screen
        // 4. Find the invalid error message and verify.

/*
<div
class="notification-box-description" --- avoid using class name in case the class name is bigger and consist percentage
id="js-notification-box-msg"
data-qa="rixawilomi">
Your email, password, IP address or location did not match
</div>
*/

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        Thread.sleep(10000);
        driver.quit();
    }
}
