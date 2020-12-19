package com.syntax.classReview03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertReview {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        String url = "https://the-internet.herokuapp.com/";
        driver.get ( url );

        driver.findElement(By.linkText("JavaScript Alerts")).click();
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        String expectedAlertText="I am a JS Alert";
        //handling first simple alert
        Alert alert=driver.switchTo().alert();
        String alertTextFromApplication=alert.getText();

        if(expectedAlertText.equals(alertTextFromApplication)) {
            System.out.println("Right alert is present.Test Pass");
        }else {
            System.out.println("Not valid text on the alert. Test fail");
        }

        alert.accept();

        //handling second confirm alert
        driver.findElement(By.cssSelector("button[onclick = 'jsConfirm()']")).click();

        alert=driver.switchTo().alert();
        //alert.getText();
        alert.dismiss();

        //handling prompt confirm alert

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        alert=driver.switchTo().alert();
        String textToSend="Hello From Batch 8";
        alert.sendKeys(textToSend);
        alert.accept();

        String enteredText=driver.findElement(By.id("result")).getText();
        //System.out.println(enteredText);
        String[] textArray=enteredText.split(":");
        //System.out.println(textArray[1]);

        if(textArray[1].trim().equals(textToSend)) {
            System.out.println("Text is matching. Test Pass");
        }else {
            System.out.println("Text is not matching. Test Fail");
        }
        driver.quit();

    }
}










