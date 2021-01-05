package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Month;
import java.util.List;

public class CalendarHandling {

    public static String url = "http://delta.com";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );

        WebElement calendar = driver.findElement ( By.id ( "input_departureDate_1" ) );
        calendar.click ( );

        WebElement dMonth = driver.findElement ( By.className ( "dl-datepicker-month-0" ) );
        String departMonthText = dMonth.getText ( );
        WebElement nextButton = driver.findElement ( By.xpath ( "//span[text()='Next']" ) );

        while (!departMonthText.equals ( "July" )) {
            nextButton.click ( );
            departMonthText = dMonth.getText ( );
        }
        List<WebElement> depatDates = driver.findElements ( By.xpath ( "//tbody[@class='dl-datepicker-tbody-0']/tr/td" ) );
        for (WebElement departDate : depatDates) {
            if (departDate.getText ( ).equals ( "4" )) {
                departDate.click ( );
                break;
            }
        }
        WebElement rMonth = driver.findElement ( By.className ( "dl-datepicker-month-1" ) );
        String returnMonth = rMonth.getText ( );
        while (!returnMonth.equals ( "September" )) {
            nextButton.click ( );
            returnMonth = rMonth.getText ( );
        }
        List<WebElement> returnDates = driver.findElements ( By.xpath ( "//tbody[@class='dl-datepicker-tbody-1']/tr/td" ) );
        for (WebElement returnDate : returnDates) {
            if (returnDate.getText ( ).equals ( "11" )) {
                returnDate.click ( );
                break;
            }

        }
        WebElement doneButton = driver.findElement(By.className("donebutton"));
        doneButton.click();
        //driver.quit ();

    }}