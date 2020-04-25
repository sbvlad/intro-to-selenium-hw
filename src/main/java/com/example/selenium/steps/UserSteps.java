package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserSteps {
    private WebDriver driver;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public com.example.selenium.steps.UserSteps login(String username, String password) {

        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);

        loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();

        Assert.assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");
        return this;
    }

    public UserSteps logout() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLogout();
        return this;
    }
}
