package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://amazon.com" );
        driver.manage ( ).window ( ).maximize ( );
        WebElement accountsAndLists=driver.findElement ( By.id ( "nav-link-accountList" ) );
        Actions action=new Actions (driver);
        Thread.sleep ( 2000 );
        action.moveToElement ( accountsAndLists ).perform ();
    }
}
