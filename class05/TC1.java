package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1 {
    /*
    TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */
    public static String url="https://www.facebook.com";

    public static void main (String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver ( );
        driver.get ( url );
        driver.manage ( ).window ( ).maximize ( );

        driver.findElement ( By.id ( "u_0_2" ) ).click ( );
        Thread.sleep ( 1000 );
        driver.findElement ( By.name ( "firstname" ) ).sendKeys ( "Sofiane" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.name ( "lastname" ) ).sendKeys ( "Ouniche" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.xpath ( "//input[@name='reg_email__']" ) ).sendKeys ( "1023456789" );
        Thread.sleep ( 1000 );
        driver.findElement ( By.id ( "password_step_input" ) ).sendKeys ( "Mig21" );
        Thread.sleep ( 1000 );

        WebElement monthDD = driver.findElement ( By.id ( "month" ) );
        Select select = new Select ( monthDD );
        List<WebElement> option = select.getOptions ( );
        int size = option.size ( );
        System.out.println ( size );

        WebElement dayDD = driver.findElement ( By.id ( "day" ) );
        Select select1 = new Select ( dayDD );
        List<WebElement> option1 = select1.getOptions ( );
        int size1 = option1.size ( );
        System.out.println ( size1 );

        WebElement yearDD = driver.findElement ( By.id ( "year" ) );
        Select select2 = new Select ( yearDD );
        List<WebElement> option2 = select2.getOptions ( );
        int size2 = option2.size ( );
        System.out.println ( size2 );

        driver.findElement ( By.id ( "month" ) ).sendKeys ( "Jan" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.name ( "birthday_day" ) ).sendKeys ( "15" );
        Thread.sleep ( 2000 );
        driver.findElement ( By.id ( "year" ) ).sendKeys ( "1977" );
        Thread.sleep ( 2000 );

       // List<WebElement> radioBtn = driver.findElements ( By.name ( "sex" ) );
       // for (WebElement radio : radioBtn) {
           // String value = radio.getAttribute ( "value" );
          //  if (radio.isEnabled ( ) && value.equalsIgnoreCase ( "Male" )) {
              //  radio.click ( );
              //  break;
                driver.findElement ( By.xpath ("//label[text()='Male']") ).click ();
                Thread.sleep ( 1000 );
                driver.quit ();

            }
        }//////////////////////////////done///////////////////////////////////////









