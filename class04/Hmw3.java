package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hmw3 {
    /*
   - HRMS Application Negative Login:
   - Open chrome browser
   - Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
   - Enter valid username
   - Leave password field empty
   - Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login" );
        driver.manage ().window ().maximize ();
        driver.findElement ( By.cssSelector ( "input#txtUsername" ) ).sendKeys ( "Admin" );
        driver.findElement ( By.cssSelector ( "input#txtPassword" ) ).sendKeys ( "" );
        driver.findElement ( By.cssSelector ( "input[id ^='btn']" ) ).click ();
        Thread.sleep ( 2000 );
        WebElement errorMessage =driver.findElement ( By.cssSelector ( "span#spanMessage") );
        boolean isPasswordEmpty = errorMessage.isDisplayed();
        System.out.println (isPasswordEmpty);
        System.out.println ("Password cannot be empty" );
        driver.close ();
    }
}