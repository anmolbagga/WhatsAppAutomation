package com.vox.test.whatsapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends AbstractTestNGCucumberTests {

	public AppiumDriver driver;
	
	public void setUp() throws MalformedURLException {
		System.out.println("hello");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "11.0");
        caps.setCapability("deviceName", "Galaxy S20 FE");
        caps.setCapability("appPackage","com.whatsapp");
        caps.setCapability("appActivity", "com.whatsapp.Main");
        caps.setCapability("skipDeviceInitialization", "true");
        caps.setCapability("skipServerInstallation","true");
        caps.setCapability("noReset", "true");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
	}
	
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
}
