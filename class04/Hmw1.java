package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hmw1 {
    /*
    Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */
    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement ( By.cssSelector ( "input#txtUsername" ) ).sendKeys ( "Admin" );
        driver.findElement (By.cssSelector ( "input#txtPassword" ) ).sendKeys ( "Hum@nhrm123" );
        driver.findElement ( By.cssSelector ( "input[class*='button']" ) ).click ();
        WebElement isLogoSyntax =driver.findElement ( By.cssSelector ( "img[src $='syntax.png']") );
        boolean isLogoSyntaxDisplayed = isLogoSyntax.isDisplayed();
        System.out.println ( isLogoSyntaxDisplayed);
    }
}
