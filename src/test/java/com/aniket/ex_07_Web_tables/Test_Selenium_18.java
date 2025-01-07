package com.aniket.ex_07_Web_tables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_18 {
    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test() throws Exception {
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(option);
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary = 'Sample Table']/tbody"));
        //below is the second way to find the xpath for the table data
        List<WebElement> row_table = table.findElements((By.tagName("tr")));

        for (int i = 0; i <= row_table.size(); i++) {
            List<WebElement> col_table = row_table.get(i).findElements(By.tagName("td"));
            for (WebElement col : col_table) {
                System.out.println(col.getText());
            }
        }


    }
}
