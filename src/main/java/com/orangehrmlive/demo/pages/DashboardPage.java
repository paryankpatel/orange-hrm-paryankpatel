package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By dashboardText = By.xpath("(//h6[normalize-space()='Dashboard'])[1]");


    public String getDashboardText(){
        return getTextFromElement(dashboardText);
    }

}
