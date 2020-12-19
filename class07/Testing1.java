package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Testing1 {

    public static String url = "https://demoqa.com/browser-windows";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );
        String parentPageHandler=driver.getWindowHandle();
        System.out.println("Parent Window Handle is "+parentPageHandler);
        //locating elements
        WebElement newTabButton=driver.findElement( By.id("tabButton"));
        WebElement newWindowButton =driver.findElement(By.id("windowButton"));
        WebElement newWindowMessage =driver.findElement(By.id("messageWindowButton"));
        //clicking them
        newTabButton.click();
        newWindowButton.click();
        newWindowMessage.click();
        //Getting all windows' handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        //iterating through them
        Iterator<String> iterator=allWindowHandles.iterator();
        while (iterator.hasNext()){
            String hande=iterator.next();
            System.out.println(driver.getTitle());
        }
    }

}
