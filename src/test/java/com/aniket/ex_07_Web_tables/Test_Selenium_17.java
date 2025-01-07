package com.aniket.ex_07_Web_tables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Test_Selenium_17 {


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test() throws Exception {
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(option);
        driver.get("https://awesomeqa.com/webtable.html");

        //table[@id = "customers"]/tbody/tr[5]/td[2]
        //xpath --- //table[@id = "customers"]/tbody/tr[
        // i = 5
        // ]/td[
        // j = 2
        // ]

        String first_path = "//table[@id = \"customers\"]/tbody/tr[";
        String second_path = "]/td[";
        String third_path = "]";


        int row = driver.findElements(By.xpath("//table[@id = \"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id = \"customers\"]/tbody/tr[2]/td")).size();

        for (int i = 2; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                String dynamic_path = first_path + i + second_path + j + third_path;
                //System.out.println(dynamic_path);
                String data = driver.findElement(By.xpath(dynamic_path)).getText(); // this will get all the text contain from webside
                //System.out.println(data);
            if(data.contains("Helen Bennett")){
                String Country_path = dynamic_path+"/following-sibling::td";
                String Country_text = driver.findElement(By.xpath(Country_path)).getText();
                System.out.println("Helen Bennett is in - "+Country_text);
            }


            }
        }

    }
}
