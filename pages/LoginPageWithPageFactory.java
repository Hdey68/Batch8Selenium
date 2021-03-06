package com.syntax.pages;

import com.syntax.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPageWithPageFactory extends CommonMethods{

    @FindBy(id = "txtUsername")
    public WebElement usernameTextbox;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement passwordTextBox;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

    public LoginPageWithPageFactory() {
        PageFactory.initElements(driver, this);
    }
}
