package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory11 {
    public UserStory11(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class = 'b24-app-icon b24-app-icon-macos']")
    public WebElement macOSIcon;

    @FindBy(xpath = "//span[@class = 'b24-app-icon b24-app-icon-windows']")
    public WebElement windowsIcon;

    @FindBy(xpath = "//span[@class = 'b24-app-icon b24-app-icon-linux']")
    public WebElement linuxIcon;

}
