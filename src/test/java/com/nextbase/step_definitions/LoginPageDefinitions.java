package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.security.auth.login.Configuration;

public class LoginPageDefinitions {

    @Given("User inputs valid credentials")
    public void user_inputs_valid_credentials() {
       LoginPage loginPage=new LoginPage();
       Driver.getDriver().get(ConfigurationReader.getProperty("bitrix_url"));
       loginPage.userNameBox.sendKeys(ConfigurationReader.getProperty("username"));
       loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);
    }



    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Portal";
        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

}
