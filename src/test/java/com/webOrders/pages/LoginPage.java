package com.webOrders.pages;

import com.webOrders.utilities.configurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class LoginPage extends AbstractBasePage{

@FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;
@FindBy(id = "ctl00_MainContent_username")
    private WebElement password;

public void login(){
    String userNameValue = configurationReader.getProperty("username");
    String passwordValue = configurationReader.getProperty("password");
    userName.sendKeys(userNameValue);
    password.sendKeys(passwordValue, Keys.ENTER);

}
public void login(String usernameValue,String passwordValue){
    userName.sendKeys(usernameValue);
    password.sendKeys(passwordValue,Keys.ENTER);
}

}
