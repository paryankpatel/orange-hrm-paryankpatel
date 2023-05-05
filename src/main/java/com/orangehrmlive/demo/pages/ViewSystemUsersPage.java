package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {
    By systemUsersText = By.xpath("(//h5[normalize-space()='System Users'])[1]");
    By usernameField = By.xpath("//input[@class='oxd-input oxd-input--active']");
    By userRollDropdown = By.xpath("//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]");
            //By.xpath("//label[@class='oxd-label oxd-input-field-required' and text()='User Role']");
            //By.xpath("//div[@class='oxd-select-text-input']");
    By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    By statusDropdown = By.linkText("-- Select --");
    By searchButton = By.xpath("//button[@type='submit']");
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By deleteButton = By.xpath("//i[@class='oxd-icon bi-trash']");


    public String getSystemUsersText (){
        return getTextFromElement(systemUsersText);
    }
    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }
    public void selectFromUserROleDropdown(String dropdown){
        selectByVisibleTextFromDropDown(userRollDropdown,dropdown);
    }
    public void enterEmployeeName(String employeeName){
        sendTextToElement(employeeNameField,employeeName);
    }
    public void selectFromStatus(String dropdown){
        selectByVisibleTextFromDropDown(statusDropdown,dropdown);
    }
    public void clickOnSearch(){
        clickOnElement(searchButton);
    }
    public void clickOnReset(){
        clickOnElement(resetButton);
    }
    public void clickOnAdd (){
        clickOnElement(addButton);
    }
    public void clickOnDelete(){
        clickOnElement(deleteButton);
    }

}
