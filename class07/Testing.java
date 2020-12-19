package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Testing {
    /*
  Go to https://demoqa.com/browser-windows
  click on New Tab and print the text from new tab in the console
  click on New Window and print the text from new window in the console
  click on New Window Message and print the text from new window in the console
  Verify the title is displayed
  Print out the title of the all pages
   */
    public static String url = "https://demoqa.com/browser-windows";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );
        String mainwindow = driver.getWindowHandle ( );

        WebElement newTabButton = driver.findElement ( By.id ( "tabButton" ) );
        newTabButton.click ( );
        Set<String> str = driver.getWindowHandles ( );
        Iterator<String> iterator = str.iterator ( );

        while (iterator.hasNext ( )) {
            String ChildWindow = iterator.next ( );
            if (!mainwindow.equalsIgnoreCase ( ChildWindow )) {
                driver.switchTo ( ).window ( ChildWindow );
                WebElement text = driver.findElement ( By.id ( "sampleHeading" )  );
                System.out.println ( "Text of the window is " + text.getText ( ) );
                driver.close ( );
            }
        }
        driver.switchTo ( ).window ( mainwindow );

                WebElement newWindow = driver.findElement ( By.id ( "windowButton" ) );
                newWindow.click ( );

                Set<String> str1= driver.getWindowHandles ( );
                Iterator<String> iterator1 = str1.iterator ( );

                while (iterator1.hasNext ( )) {
                    String ChildWindow1 = iterator1.next ( );
                    if (!mainwindow.equalsIgnoreCase ( ChildWindow1 )) {
                        driver.switchTo ( ).window ( ChildWindow1 );
                        WebElement text1 = driver.findElement ( By.id ( "sampleHeading" ) );
                        System.out.println ( "Text of the window is " + text1.getText ( ) );
                        driver.close ( );
                    }
                }
                driver.switchTo ( ).window ( mainwindow );

        WebElement newWindowMessage=driver.findElement ( By.id ( "messageWindowButton" ) );
        newWindowMessage.click ();
        Set<String> str2 = driver.getWindowHandles ( );
        Iterator<String> iterator2 = str2.iterator ( );

        while (iterator2.hasNext ( )) {
            String ChildWindow2 = iterator2.next ( );
            if (!mainwindow.equalsIgnoreCase ( ChildWindow2 )) {
                driver.switchTo ( ).window ( ChildWindow2 );
                WebElement text2 = driver.findElement ( By.xpath ( "/html/body/text()" ) ) ;
                System.out.println ( "Text of the window is " + text2.getText ( ) );
                driver.close ( );
            }
        }
        driver.switchTo ( ).window ( mainwindow );
            }
        }



