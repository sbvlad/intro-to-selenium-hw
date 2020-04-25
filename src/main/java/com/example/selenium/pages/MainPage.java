package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends com.example.selenium.pages.BasePage {

    //to find the title
    @FindBy(css = "h2")
    private WebElement title;

    //to find the logout button
    @FindBy(css = ".icon-2x")
    private WebElement logout;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
    }

    public MainPage clickLogout() {

        logout.click();
        return this;
    }
}
