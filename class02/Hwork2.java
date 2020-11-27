package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwork2 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\sofiane\\eclipse-workspace\\SeleniumBasics\\drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement ( By.id ( "u_0_2" ) ).click ( );
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "firstname" ) ).sendKeys ( "Sofiane" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "lastname" ) ).sendKeys ( "Ouniche" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "reg_email__" ) ).sendKeys ( "Jet.Fighter@gmail.com" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "reg_email_confirmation__" ) ).sendKeys ( "Jet.Fighter@gmail.com" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "reg_passwd__" ) ).sendKeys ( "Mig31" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.id ( "u_1_s" ) ).click ( );
        Thread.sleep ( 3000 );
        driver.findElement ( By.id ( "u_1_9" ) ).click ( );
        Thread.sleep ( 3000 );
        driver.quit ( );
    }
}
////////////////////////////////////////////////////done//////////////////////////////////////////////////////////


