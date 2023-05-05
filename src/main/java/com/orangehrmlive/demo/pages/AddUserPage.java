package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {
    By addUserText = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
    By userRoleDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By admin = By.xpath("//div[@class=\"oxd-select-dropdown --positon-bottom\"]/div[2]");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By userNameField = By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By statusDropdown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]");
    By passwordField = By.xpath("(//input[@type='password'])[1]");
    By confirmPasswordField = By.xpath("(//input[@type='password'])[2]");
    By saveButton = By.xpath("//button[@type='submit']");
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    By successfullySavedText = By.xpath("");
//
//    public void selectUserRoleDropdown(String option) {
//        selectByContainsTextFromDropDown(userRoleDropDown, option);
//    }

    public void clickOnRoleDropDown(){
        clickOnElement(userRoleDropDown);
    }
    public void clickOnAdminDropDown(){
        clickOnElement(admin);
    }
    public void enterEmployeeName(String employeename) {
        sendTextToElement(employeeNameField, employeename);
    }


    public void selectStatusDropdown(String option) {
        selectByVisibleTextFromDropDown(statusDropdown, option);
    }

    public void enterUsername(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField,confirmPassword);
    }

    public void clickOnSave(){
        clickOnElement(saveButton);
    }

    public void clickOnCancel(){
        clickOnElement(cancelButton);
    }

    public String getAddUserText(){
        return getTextFromElement(addUserText);
    }

    public String getSuccessfullySavedText(){
        return getTextFromElement(successfullySavedText);
    }
}
