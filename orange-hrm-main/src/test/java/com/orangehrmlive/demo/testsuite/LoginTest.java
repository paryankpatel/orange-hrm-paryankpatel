package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();


    @Test
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        Assert.assertEquals(dashboardPage.getDashboardText(), "Dashboard", "Displayed correctly");

    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage() {
        loginPage.logoIsDisplayed();
        //Verify Logo is Displayed
        //isDisplayed()
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        homePage.clickOnUserProfileLogo();
        homePage.mouseHoverOnLogoutAndClick();
        //Verify the text "Login Panel" is displayed
       Assert.assertTrue(loginPage.getTextofLoginPanel().contains("Admin"));

    }
}
