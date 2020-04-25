package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
