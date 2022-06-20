package com.org.mobile.automation.services;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverInitialiser {
    public static AppiumDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        desiredCapabilities.setCapability("newCommandTimeout", 300);
       /*Uncomment the code if the apks are not installed- Comment it out after installation*/
        /*desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\src\\main\\resources\\apk-path\\Apk-Info.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\Github_Projects\\mobile-automation\\src\\main\\resources\\apk-path\\ApiDemos-debug.apk");
       */
        desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
        desiredCapabilities.setCapability("appActivity", ".ApiDemos");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
        System.out.println(driver.getSessionId());
        return driver;
    }
}

