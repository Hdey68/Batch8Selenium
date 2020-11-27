package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main (String[] args) {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\sofiane\\eclipse-workspace\\SeleniumBasics\\drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://www.youtube.com/" );
        driver.findElement ( By.className ( "style-scope yt-img-shadowcd" ) ).click ();
    }
}