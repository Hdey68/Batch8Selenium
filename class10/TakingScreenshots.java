package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots  {

    public static void main (String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";


            System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
            WebDriver driver = new ChromeDriver ( );
            driver.get ( url );
            driver.manage ( ).window ( ).maximize ( );

            driver.findElement( By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB );
            driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test",Keys.ENTER);
            //driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        TakesScreenshot ts=(TakesScreenshot)driver;
        File sourceFile=ts.getScreenshotAs ( OutputType.FILE );//the screenshot is taking here

        try {
            FileUtils.copyFile ( sourceFile,new File ( "screenshots/HRMS/adminLogin.png" ) );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

    }
}
