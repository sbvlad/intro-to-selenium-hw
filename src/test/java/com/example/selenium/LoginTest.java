package com.example.selenium;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import com.example.selenium.steps.UserSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {




    @Test
    public void login() {

        UserSteps steps = new UserSteps(driver);
        steps.login("tomsmith","SuperSecretPassword!");
        steps.logout();
    }
}
