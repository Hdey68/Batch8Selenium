package com.syntax.pages;

import com.syntax.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class DashboardPage extends CommonMethods {

    @FindBy(css = "a#welcome")
    public WebElement welcomeAdmin;

   // @FindBy(xpath = "//table[@id='resultTable']/tbody/tr")
   // public List<WebElement> tableRows;

    public DashboardPage() {
        PageFactory.initElements(driver, this);

    }
}
