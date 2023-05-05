package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.xpath("//input[@placeholder='Username']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[@type='submit']");
   public static By logo = By.xpath("(//img[@alt='orangehrm-logo'])[2]");
    By hrForAllLogo = By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']");

    By loginPanel = By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']");


    public void enterUserName(String userName) {
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLogin(){
        clickOnElement(loginButton);
    }

    public String getTextofHrForAllLog() {
        return getTextFromElement(hrForAllLogo);
    }

    public String getTextofLoginPanel (){
        return getTextFromElement(loginPanel);
    }

    public boolean logoIsDisplayed() {

        //return driver.findElement(logo).isDisplayed();
         try {
            return driver.findElement(logo).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }

    }

    public String getTextForNoRecordsFound(){
        return getTextFromAlert();
    }

   }




