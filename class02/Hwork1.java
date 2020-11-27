package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwork1 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\sofiane\\eclipse-workspace\\SeleniumBasics\\drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22" );
        driver.findElement ( By.name ( "customer.firstName" ) ).sendKeys ( "Sofiane" );
        driver.findElement ( By.name ( "customer.lastName" ) ).sendKeys ( "Ouniche" );
        driver.findElement ( By.id ( "customer.address.street" ) ).sendKeys ( "12302 field lark ct" );
        driver.findElement ( By.name ( "customer.address.city" ) ).sendKeys ( "Fairfax" );
        driver.findElement ( By.name ( "customer.address.state" ) ).sendKeys ( "VA" );
        driver.findElement ( By.id ( "customer.address.zipCode" ) ).sendKeys ( "22033" );
        driver.findElement ( By.id ( "customer.phoneNumber" ) ).sendKeys ( "1231231234" );
        driver.findElement ( By.id ( "customer.ssn" ) ).sendKeys ( "101010101" );
        driver.findElement ( By.id ( "customer.username" ) ).sendKeys ( "SosSyntax" );
        driver.findElement ( By.name ( "customer.password" ) ).sendKeys ( "HelloSyn" );
        driver.findElement ( By.name ( "repeatedPassword" ) ).sendKeys ( "HelloSyn" );
        driver.findElement(By.className("button")).click();
        driver.findElement ( By.name ( "username" ) ).sendKeys ( "SosSyntax" );
        driver.findElement ( By.name ( "password" ) ).sendKeys ( "HelloSyn" );
        driver.findElement ( By.className ( "button" )).click ();
        Thread.sleep ( 4000 );
        driver.quit ();
}
}

////////////////////////////////////////////////////////////////////done////////////////////////////////////////////////////////////////////////////////////////////