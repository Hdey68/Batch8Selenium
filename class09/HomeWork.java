package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

 public class HomeWork extends CommonMethods {
/*
Go to http://18.232.148.34/humanresources/symfony/web/index.php/auth/login
click on leave
click on leave list
choose from "From calendar"
choose from "To calendar"
click only on cancelled and rejected checkboxes
uncheck Pending Approval
select IT support from DD
click search
quit the browser
 */
   public static void main (String[] args) throws InterruptedException {

      setUp ( );

      WebElement username = driver.findElement ( By.id ( "txtUsername" ) );
      username.sendKeys ( "Admin" );
      WebElement password = driver.findElement ( By.id ( "txtPassword" ) );
      password.sendKeys ( "Hum@nhrm123" );
      WebElement login = driver.findElement ( By.id ( "btnLogin" ) );
      login.click ( );
      Thread.sleep ( 2000 );

      WebElement leaveHead = driver.findElement ( By.xpath ( "//*[@id=\"menu_leave_viewLeaveModule\"]/b" ) );
      leaveHead.click ( );
      WebElement leaveListHead = driver.findElement ( By.id ( "menu_leave_viewLeaveList" ) );
      leaveListHead.click ( );

      WebElement calFromDate = driver.findElement ( By.xpath ( "//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[1]/img" ) );
      calFromDate.click ( );

      WebElement mDD = driver.findElement ( By.className ( "ui-datepicker-month" ) );
      Select monthDD = new Select ( mDD );
      monthDD.selectByVisibleText ( "Aug" );
      WebElement yDD = driver.findElement ( By.xpath ( "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]" ) );
      Select yearDD = new Select ( yDD );
      yearDD.selectByVisibleText ( "2022" );

      List<WebElement> fromDates = driver.findElements ( By.xpath ( "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[6]/a" ) );
      for (WebElement fromDate : fromDates) {
          if (fromDate.getText ( ).equals ( "27" )) {
              fromDate.click ( );
              break;
          }
      }
      WebElement calToDate = driver.findElement ( By.name ( "leaveList[calToDate]" ) );
      calToDate.click ( );
      WebElement mDD1 = driver.findElement ( By.className ( "ui-datepicker-month" ) );
      Select monthDD1 = new Select ( mDD1 );
      monthDD1.selectByVisibleText ( "Sep" );
      WebElement yDD1 = driver.findElement ( By.xpath ( "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]" ) );
      Select yearDD1 = new Select ( yDD1 );
      yearDD1.selectByVisibleText ( "2022" );

      List<WebElement> toDates = driver.findElements (By.xpath ( "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[2]/a" ) );
      for (WebElement toDate : toDates) {
          if (toDate.getText ( ).equals ( "13" )) {
              toDate.click ( );
              break;
          }
      }
      WebElement checkBoxRejec=driver.findElement ( By.id ( "leaveList_chkSearchFilter_-1" ) );
      checkBoxRejec.click ();
      WebElement checkBoxCancel=driver.findElement ( By.id ( "leaveList_chkSearchFilter_0" ) );
      checkBoxCancel.click ();
      WebElement uncheckBoxPending=driver.findElement ( By.id ( "leaveList_chkSearchFilter_1" ) );
      uncheckBoxPending.click ();

      WebElement subUnitDD=driver.findElement ( By.id ( "leaveList_cmbSubunit" ) );
      Select subDD=new Select ( subUnitDD );
      subDD.selectByVisibleText ( "IT Support" );
      WebElement searchButton=driver.findElement ( By.id ( "btnSearch" ) );
      searchButton.click ();
       System.out.println ("No Such Records Found" );
      driver.quit ();

  }
}

