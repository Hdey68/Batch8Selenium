package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticWebTables {
    public static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );

        List<WebElement> rowData = driver.findElements ( By.xpath ( "//table[@id='task-table']/tbody/tr" ) );
        System.out.println ( rowData.size ( ) );
        Iterator<WebElement> it = rowData.iterator ( );
        while (it.hasNext ( )) {
            WebElement row = it.next ( );
            String rowText = row.getText ( );
            System.out.println ( rowText );
        }
        System.out.println ( "-----------------------------------------------------" );

        List<WebElement> colsData = driver.findElements ( By.xpath ( "//table[@id='task-table']/thead/tr/th" ) );
        System.out.println ( "Number of cols " + colsData.size ( ) );
        for (WebElement col : colsData) {
            String colsText = col.getText ( );
            System.out.println ( colsText );

        }
    }
}