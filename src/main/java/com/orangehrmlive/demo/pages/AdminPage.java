package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By userManagementDropdown =By.xpath("//span[normalize-space()='User Management']");
    By jobDropDown = By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']");
    By organisationDropDown = By.xpath("//span[normalize-space()='Organization']");



    public void mouseHoverToUserManagementAndClick(){
        mouseHoverToElementAndClick(userManagementDropdown);
    }

    public void mouseHOverToJobAndClick(){
        mouseHoverToElementAndClick(jobDropDown);
    }

    public void mouseHoverToOrganisationAndClick(){
        mouseHoverToElementAndClick(organisationDropDown);
    }




}
