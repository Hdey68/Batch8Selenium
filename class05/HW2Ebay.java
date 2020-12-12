package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2Ebay {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static String url = "http://ebay.com";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );

        WebElement allCategories=driver.findElement ( By.id ( "gh-cat" ) );
        Thread.sleep ( 1000 );
        Select select=new Select ( allCategories );

        List<WebElement> options=select.getOptions ();
        for (WebElement option:options){
            String optionText= option.getText ( );
            System.out.println (optionText );
        }
        select.selectByVisibleText ( "Computers/Tablets & Networking" );
        driver.findElement ( By.id ( "gh-btn" ) ).click ();

        WebElement verifyHeader =driver.findElement ( By.cssSelector ( "span[class*='b-pageheader']") );
        boolean isCTNHDisplayed = verifyHeader.isDisplayed();

        System.out.println ( "The header Computers, Tablets & Network Hardware is display :"+isCTNHDisplayed);
        Thread.sleep ( 2000 );
        driver.quit ();

    }
}