package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_SyntaxTechs {
    /*
    Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url = "http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );
        Thread.sleep ( 1000 );

        driver.findElement ( By.cssSelector ( "button[class='btn btn-default']" ) ).click ();
        Alert alertBox=driver.switchTo ( ).alert ( );
        Thread.sleep ( 1000 );
        alertBox.accept ();
        Thread.sleep ( 1000 );

        driver.findElement ( By.cssSelector ( "button[class='btn btn-default btn-lg']" ) ).click ();
        Alert confirmBox=driver.switchTo ( ).alert ( );
        Thread.sleep ( 1000 );
        confirmBox.dismiss ();
        Thread.sleep ( 1000 );

        driver.findElement ( By.cssSelector ( "button[onclick='myPromptFunction()']" ) ).click ();
        Thread.sleep ( 1000 );
        Alert promptBox=driver.switchTo ( ).alert ( );
        Thread.sleep ( 1000 );
        promptBox.sendKeys ( "My name is Sofiane" );
        Thread.sleep ( 3000 );
        promptBox.accept ();

    }
}
//////////////////////////////////////////////done///////////////////////////////////////////////////////