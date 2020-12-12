package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1Facebook {
    /*
    Go to facebook sign up page
Fill out the whole form
Click signup
     */
    public static String url = "http://facebook.com";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );


        driver.findElement ( By.id ( "u_0_2" ) ).click ( );
        Thread.sleep ( 1000 );
        driver.findElement ( By.name ( "firstname" ) ).sendKeys ( "Sofiane" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.name ( "lastname" ) ).sendKeys ( "Ouniche" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.xpath ( "//input[@name='reg_email__']" ) ).sendKeys ( "Algerian.Airforce@hotmail.com" );
        Thread.sleep ( 1000 );
        Thread.sleep ( 1000 );
        driver.findElement ( By.id ( "u_2_j" ) ).sendKeys ( "Algerian.Airforce@hotmail.com" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.id ( "password_step_input" ) ).sendKeys ( "MIG23F" );
        Thread.sleep ( 1000 );
        WebElement month = driver.findElement ( By.id ( "month" ) );
        WebElement day = driver.findElement ( By.id ( "day" ) );
        WebElement year = driver.findElement ( By.id ( "year" ) );
        Select select = new Select ( month );
        select.selectByVisibleText ( "May" );
        Thread.sleep ( 1000 );
        Select select1 = new Select ( day );
        select1.selectByVisibleText ( "10" );
        Thread.sleep ( 1000 );
        Select select2 = new Select ( year );
        select2.selectByVisibleText ( "1980" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.xpath ( "//input[@value='2']" ) ).click ( );
        Thread.sleep ( 1000 );
        driver.findElement ( By.cssSelector ( "button[class*='_6wk']" ) ).click ( );
        Thread.sleep ( 5000 );
        driver.close ( );
    }
    }
////////////////////////////////////////done///////////////////////////////////////////////////////////

