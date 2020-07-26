package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.pages.UserStory11;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory11Step_definitions extends LoginPage {

    LoginPage loginPage=new LoginPage();
    UserStory11 userStory11 = new UserStory11();

    @Given("User should be able to login the page")
    public void user_should_be_able_to_login_the_page() {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrix_url"));
        Driver.getDriver().manage().window().maximize();
        loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("User should be able to click on Mac Os icon under Desktop")
    public void user_should_be_able_to_click_on_mac_os_icon_under_desktop() {
        wait.until(ExpectedConditions.visibilityOf(userStory11.macOSIcon)).click();
    }

    @Then("User should be able to click on Windows icon under Desktop Client to downloan Windows version of Bitrix.")
    public void user_should_be_able_to_click_on_windows_icon_under_desktop_client_to_downloan_windows_version_of_bitrix() {
        wait.until(ExpectedConditions.visibilityOf(userStory11.windowsIcon)).click();
    }

}
