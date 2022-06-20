package com.org.mobile.automation.services;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class WaitService {
    public AppiumDriver driver;
//    public WebDriverWait wait;

    public WaitService(AppiumDriver driver) throws MalformedURLException {
        this.driver = DriverInitialiser.getAndroidDriver();
    }

    public void visibilityOfElementToTap() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Accessibility']"))).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
