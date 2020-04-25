package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    //    WebElement corresponding to our username field
    @FindBy(id = "username")
    private WebElement username;


    //    WebElement corresponding to our password field
    @FindBy(id = "password")
    private WebElement password;

    //    WebElement corresponding to our login button
    @FindBy(css = ".fa")
    private WebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage setUsername(String text) {

        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        password.sendKeys(text);
        return this;
    }


    public MainPage clickLogin() {
        login.click();
        return new MainPage(driver);
    }
}
