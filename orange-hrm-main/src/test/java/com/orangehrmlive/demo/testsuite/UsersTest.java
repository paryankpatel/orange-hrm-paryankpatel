package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {
    AddUserPage addUserPage = new AddUserPage();
    AdminPage adminPage = new AdminPage();
    DashboardPage dashboardPage = new DashboardPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();


    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLogin();
        homePage.clickOnAdmin();
        Assert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "Text not matching!");
        viewSystemUsersPage.clickOnAdd();
        Assert.assertEquals(addUserPage.getAddUserText(),"Add User", "Invalid Text!");
        Thread.sleep(1000);
        addUserPage.clickOnRoleDropDown();
        addUserPage.clickOnAdminDropDown();
       // addUserPage.selectUserRoleDropdown("Admin");
        addUserPage.enterEmployeeName("Ananya Dash");
        addUserPage.enterUsername("Nirali");
        addUserPage.selectStatusDropdown("Disabled");
        addUserPage.enterPassword("Ananya123");
        addUserPage.enterConfirmPassword("Ananya123");
        addUserPage.clickOnSave();
        //Assert.assertEquals(AddUserPage.getSuccessfullySavedText,"Successfully Saved","Message not displayed correctly!");

    }
@Test
public void searchTheUserCreatedAndVerifyIt(){
    loginPage.enterUserName("Admin");
    loginPage.enterPassword("admin123");
    loginPage.clickOnLogin();
    homePage.clickOnAdmin();
    Assert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "Text not matching!");
    viewSystemUsersPage.enterUsername("Nirali123");
    viewSystemUsersPage.selectFromUserROleDropdown("Admin");
    viewSystemUsersPage.enterEmployeeName("Nirali");
    viewSystemUsersPage.selectFromStatus("Disabled");
    viewSystemUsersPage.clickOnSearch();
    //Verify the User should be in Result list.
}

@Test
public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
    loginPage.enterUserName("Admin");
    loginPage.enterPassword("admin123");
    loginPage.clickOnLogin();
    homePage.clickOnAdmin();
    Assert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "Text not matching!");
    viewSystemUsersPage.enterUsername("Nirali123");
    viewSystemUsersPage.selectFromUserROleDropdown("Admin");
    viewSystemUsersPage.enterEmployeeName("Nirali");
    viewSystemUsersPage.selectFromStatus("Disabled");
    viewSystemUsersPage.clickOnSearch();
    //Verify the User should be in Result list.
    //Click on Check box
    //	Click on Delete Button
    //	Popup will display
    //	Click on Ok Button on Popup
    //	verify message "Successfully Deleted"

}

@Test
public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
    loginPage.enterUserName("Admin");
    loginPage.enterPassword("admin123");
    loginPage.clickOnLogin();
    homePage.clickOnAdmin();
    Assert.assertEquals(viewSystemUsersPage.getSystemUsersText(), "System Users", "Text not matching!");
    viewSystemUsersPage.enterUsername("Nirali123");
    viewSystemUsersPage.selectFromUserROleDropdown("Admin");
    viewSystemUsersPage.enterEmployeeName("Nirali");
    viewSystemUsersPage.selectFromStatus("Disabled");
    viewSystemUsersPage.clickOnSearch();
   //verify message "No Records Found
    Assert.assertTrue(loginPage.getTextForNoRecordsFound().contains("No Records Found"));
}

}
