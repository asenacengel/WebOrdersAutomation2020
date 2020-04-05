package com.webOrders.pages;

import com.webOrders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractBasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 20);


public AbstractBasePage(){
    PageFactory.initElements(Driver.getDriver(), this);


}
}
