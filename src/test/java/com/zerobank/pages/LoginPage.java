package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id = "user_login")
    public WebElement UserLoginElement;

    @FindBy(id = "user_password")
   public WebElement UserPasswordElement;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement singInButton;


    public void login ()  {
        UserLoginElement.sendKeys(ConfigurationReader.getProperty("login"));
        UserPasswordElement.sendKeys(ConfigurationReader.getProperty("password"));
        singInButton.click();

    }




}
