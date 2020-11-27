package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    1 lunch the browser
    2 navigate to amazon website
    3 print out the title the url in the console
     */
    public static void main (String[] args) {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\sofiane\\eclipse-workspace\\SeleniumBasics\\drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "https://amazon.com" );
        String title = driver.getTitle ( );
        System.out.println ( title );
        String url = driver.getCurrentUrl ( );
        System.out.println ( url );
    }
}