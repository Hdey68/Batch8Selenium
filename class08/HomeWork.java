package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
    click on checkbox and click on remove
    verify the text
    click on enable verify the textbox is enabled
    enter text and click disable
    verify the textbox is disabled
     */
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main (String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );

        WebElement checkBox=driver.findElement ( By.xpath ( "//input[@type='checkbox']" ) );
        checkBox.click ();
        WebElement removeButton= driver.findElement ( By.xpath ( "//*[@id=\"checkbox-example\"]/button" ) );
        removeButton.click ();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement msg=driver.findElement ( By.xpath ( "//p[@id='message']" ) );
        String text= msg.getText ( );
        System.out.println ("Verify Text Box: "+text );

        WebElement enableBox=driver.findElement ( By.xpath ( "//*[@id=\"input-example\"]/button" ) );
        enableBox.click ();

        WebElement textBox=driver.findElement (By.xpath ( "//p[@id='message']" ) );
        String text1= textBox.getText ( );
        System.out.println ("Verify Text Enable Box: "+text1 );

        WebElement enterText=driver.findElement ( By.xpath ( "//input[@type='text']" ) );
        enterText.sendKeys ( "It's enabled again" );
        WebElement disableBox=driver.findElement ( By.xpath ( "//button[@onclick='swapInput()']" ) );
        disableBox.click ();
        WebElement textDisableBox=driver.findElement ( By.xpath ( "//p[@id='message']" ) );
        String text2=textDisableBox.getText ();
        System.out.println ("Verify Text Disable Box: "+text2 );
        driver.quit ();
    }
}
