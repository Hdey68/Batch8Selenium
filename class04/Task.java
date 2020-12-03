package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*
    Navigate to http://syntaxtechs.com/selenium-practice/index.php
Click on start practicing
click on simple form demo
enter any text on first text box
click on show message
     */
    public static void main (String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );

        driver.get ( "http://syntaxtechs.com/selenium-practice/index.php" );
        driver.manage ( ).window ( ).maximize ( );

        driver.findElement ( By.cssSelector ( "a#btn_basic_example" ) ).click ();
        Thread.sleep ( 3000 );
        driver.findElement ( By.xpath ( "(//a[text()='simple form Demo'])[2]" )).click ();
        Thread.sleep ( 3000 );
        driver.findElement ( By.cssSelector ( "input#user-message" ) ).sendKeys ( "Welcome" );
        Thread.sleep ( 3000 );
        driver.findElement ( By.cssSelector ( "//button[contains(@onclick,'')]" ) ).click ();

       driver.quit ();
    }
}