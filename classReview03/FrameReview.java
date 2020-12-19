package com.syntax.classReview03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameReview {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        String url = "https://the-internet.herokuapp.com/";
        driver.get ( url );

        driver.findElement ( By.linkText ( "Frames" ) ).click ( );
        driver.findElement ( By.linkText ( "iFrame" ) ).click ( );

        // we need to enter text into textbox
        //1. we need to switch to the frame (id or name / webelement /index)

        driver.switchTo().frame("mce_0_ifr");

        WebElement textBox=driver.findElement(By.xpath("//body[@id = 'tinymce']/p"));
        textBox.clear();
        textBox.sendKeys("Hello from Batch 8");

        //switching back to the main window
        driver.switchTo().defaultContent();
        boolean isDisplayed=driver.findElement(By.xpath("//img[contains(@alt, 'Fork')]")).isDisplayed();

        if(isDisplayed) {

            System.out.println("Image is displayed. Test pass");
        }else {
            System.out.println("Image is NOT displayed. Test fail");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
