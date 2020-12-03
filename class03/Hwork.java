package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwork {
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
        driver.manage ().window ().maximize ();
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//a[@id='btn_basic_example']" ) ).click ();
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//a[contains(@href,'first')]/parent::div" ) ).click ();
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//input[@id='user-message']" ) ).sendKeys ( "Welcome to your new way to practice Selenium with Syntax Technologies" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//button[contains(@onclick,'')]" ) ).click ();
        Thread.sleep ( 2000 );
        driver.quit ();


    }
}