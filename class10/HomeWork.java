package com.syntax.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Month;
import java.util.List;

public class HomeWork {

    /*
    Go to aa.com/homePage.do
  select depart date
  select return date
  select destination
  click on search
  quit the browser
     */
    public static void main (String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( "http://aa.com" );
        driver.manage ( ).window ( ).maximize ( );

        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs ( OutputType.FILE );//the screenshot is taking here

        try {
            FileUtils.copyFile ( sourceFile, new File ( "screenshots/aa/1-openningAABrowser.png" ) );
        } catch (IOException e) {
            e.printStackTrace ( );
        }

        WebElement book = driver.findElement ( By.id ( "jq-findFlights" ) );
        book.click ( );
        WebElement flight = driver.findElement ( By.xpath ( "//*[@id=\"reservationFlightSearchForm\"]/div[1]/div/ul/li[1]/label/span[2]" ) );
        flight.click ( );
        WebElement roundTrip = driver.findElement ( By.xpath ( "//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[1]/label/span[3]" ) );
        roundTrip.click ( );
        WebElement redeemMiles = driver.findElement ( By.xpath ( "//*[@id=\"bookingCheckboxContainer\"]/div[2]/div/label" ) );
        redeemMiles.click ( );

        WebElement departFrom = driver.findElement ( By.id ( "reservationFlightSearchForm.originAirport" ) );
        departFrom.clear ( );
        departFrom.sendKeys ( "DCA" );
        WebElement destinationTo = driver.findElement ( By.name ( "destinationAirport" ) );
        destinationTo.sendKeys ( "ALG" );
        WebElement numOfPass = driver.findElement ( By.id ( "flightSearchForm.adultOrSeniorPassengerCount" ) );
        numOfPass.sendKeys ( "5" );

        WebElement departDate = driver.findElement ( By.id ( "aa-leavingOn" ) );
        departDate.click ( );
        WebElement departMonth = driver.findElement ( By.xpath ( "//span[@class='ui-datepicker-month']" ) );
        String departmonthtext = departMonth.getText ( );

        while (!departmonthtext.equals ( "August" )) {
            WebElement nextbuttonCalendar = driver.findElement ( By.xpath ( "//a[@title = 'Next']" ) );
            nextbuttonCalendar.click ( );
            departMonth = driver.findElement ( By.xpath ( "(//span[@class = 'ui-datepicker-month'])[1]" ) );
            departmonthtext = departMonth.getText ( );
        }
        List<WebElement> departDays = driver.findElements ( By.xpath ( "//table[@class='ui-datepicker-calendar']/tbody/tr/td" ) );
        for (WebElement departDay : departDays) {
            if (departDay.getText ( ).equals ( "13" )) {
                departDay.click ( );
                break;
            }
        }
        WebElement returnDate = driver.findElement ( By.id ( "aa-returningFrom" ) );
        returnDate.click ( );
        WebElement returnMonth = driver.findElement ( By.xpath ( "//span[@class='ui-datepicker-month']" ) );
        String returnMonthText = returnMonth.getText ( );
        while (!returnMonthText.equals ( "October" )) {
            WebElement nextbuttonCalendar = driver.findElement ( By.xpath ( "//a[@title = 'Next']" ) );
            nextbuttonCalendar.click ( );
            returnMonth = driver.findElement ( By.xpath ( "//div[@class='ui-datepicker-title']/span" ) );
            returnMonthText = returnMonth.getText ( );
        }
        List<WebElement> returnDays = driver.findElements ( By.xpath ( "//table[@class='ui-datepicker-calendar']/tbody/tr/td" ) );
        for (WebElement returnDay : returnDays) {
            if (returnDay.getText ( ).equals ( "25" )) {
                returnDay.click ( );
                break;
            }
        }
        TakesScreenshot ts1 = (TakesScreenshot) driver;
        File sourceFile1 = ts1.getScreenshotAs ( OutputType.FILE );

        try {
            FileUtils.copyFile ( sourceFile1, new File ( "screenshots/aa/2-tripSearch.png" ) );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        WebElement searchButton = driver.findElement ( By.id ( "flightSearchForm.button.reSubmit" ) );
        searchButton.click ( );

        TakesScreenshot ts2 = (TakesScreenshot) driver;
        File sourceFile2 = ts2.getScreenshotAs ( OutputType.FILE );

        try {
            FileUtils.copyFile ( sourceFile2, new File ( "screenshots/aa/3-searchResult.png" ) );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
        Thread.sleep ( 5000 );
        driver.quit ();




    }
    }


