package com.org.mobile.automation.services;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class ElementService {
    public AppiumDriver driver;
    private WaitService waitService;

    public ElementService(AppiumDriver driver) throws MalformedURLException {
        this.driver =driver;
    }

    public void tapElementByVisibility(String elementType,String elementAttribute) throws MalformedURLException {
        waitService = new WaitService(driver);
        switch (elementType.toLowerCase()){
            case "xpath":
                waitService.visibilityOfElementToTapByXpath(elementAttribute);
                break;

        }

    }
}
