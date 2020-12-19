package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2Class07 {
    /*
    navigate to http://www.uitestpractice.com/Students/Contact
    click on the link
    get text
    print out in the console
     */
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );

        WebElement dataAjax=driver.findElement ( By.cssSelector ( "a[href='/Students/_P1']" ) );
        dataAjax.click ();

        driver.manage ().timeouts ().implicitlyWait ( 20, TimeUnit.SECONDS );
        WebElement dataAjaxText= driver.findElement (By.cssSelector ( "div[class='ContactUs']" ) );
        System.out.println(dataAjaxText.getText ());
        driver.quit ();

    }
}