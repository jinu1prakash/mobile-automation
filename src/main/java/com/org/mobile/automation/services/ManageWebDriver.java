package com.org.mobile.automation.services;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class ManageWebDriver {
    private static AppiumDriver driver;

    public ManageWebDriver(AppiumDriver driver){
        this.driver = driver;
    }

    public  AppiumDriver getDriver() {
        return driver;
    }
}
