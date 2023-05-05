package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By searchField =By.xpath("//input[@placeholder='Search']");
    By adminLink = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    By pimLink = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    By leaveLink = By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
    By dashboardLink = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']");
    By userProfileLogo = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logoutLink = By.xpath("//a[normalize-space()='Logout']");


    public void clickOnSearch(){
        clickOnElement(searchField);
    }
    public void clickOnAdmin (){
        clickOnElement(adminLink);
    }
    public void clickOnPim(){
        clickOnElement(pimLink);
    }
    public void clickOnLeave(){
        clickOnElement(leaveLink);
    }
    public void clickOnDashboard(){
        clickOnElement(dashboardLink);
    }

    public void clickOnUserProfileLogo(){
        clickOnElement(userProfileLogo);
    }

    public void mouseHoverOnLogoutAndClick(){
        mouseHoverToElementAndClick(logoutLink);
    }

}
