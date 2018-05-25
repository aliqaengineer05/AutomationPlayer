package com.cocoin.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TesstBase {
	
    public static AndroidDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException{
        initDriver();
    }

    
	public AndroidDriver getDriver() {
        return driver;
    }
   
	private void initDriver() throws MalformedURLException{
      System.out.println("Inside initDriver method");
      DesiredCapabilities capabilities = new DesiredCapabilities();
  	  capabilities.setCapability("deviceName", "Galaxy J7");
  	  capabilities.setCapability("platformVersion", "7.0");
  	  capabilities.setCapability("platformName", "Android");
  	  capabilities.setCapability("appPackage", "com.nightonke.cocoin");                
  	  capabilities.setCapability("appActivity", "com.nightonke.saver.activity.SplashActivity");
  	  driver = new AndroidDriver(new URL("http://127.0.0.2:4723/wd/hub"), (Capabilities) capabilities);
  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	  wait = new WebDriverWait(driver, 5000);
  	  wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.RelativeLayout")));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
	
}
