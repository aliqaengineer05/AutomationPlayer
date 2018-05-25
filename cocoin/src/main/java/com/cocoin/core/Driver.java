package com.cocoin.core;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Driver {
	
	     
	public static void swipe() throws Exception {
		Dimension size = driver.manage().window().getSize();
		  System.out.println(size);
		  driver.swipe(size.width-1,  size.height/2, 1,  size.height/2, 200);
		}
	

	public static void swipeHorizontal(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
		
		
		Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).waitAction().moveTo(endPoint, anchor).release().perform();
		
    }
public static void swipeHorizontally(AppiumDriver driver, double startPercentage, double finalPercentage, double anchorPercentage, int duration) throws Exception {
		
	
		Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).waitAction().moveTo(endPoint, anchor).release().perform();
	
    }

	
	private static  AndroidDriver driver;
	 static WebDriverWait wait;
	@SuppressWarnings("rawtypes")
	public static void main(String[]args) throws Exception
	 {
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
	  Thread.sleep(3000);
	  swipe();
	  Thread.sleep(3000);
	  swipe();
	  Thread.sleep(3000);
	  swipeHorizontal((AppiumDriver) driver,0.9,0.01,0.5,200);
	  Thread.sleep(3000);
	  swipeHorizontally((AppiumDriver) driver,0.9,0.01,0.5,200);
//Keyboard
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/frame_layout")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  driver.findElement(By.id("com.nightonke.cocoin:id/frame_layout")).click();
	  
	  // Add Expense 
	  
	  /*Thread.sleep(3000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/tag_image")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//android.widget.FrameLayout[@index='11']")).click();*/
	  Thread.sleep(3000);
	  
	  // Add Verify AddedExpense 
	  driver.findElement(By.id("com.nightonke.cocoin:id/content_hamburger")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("com.nightonke.cocoin:id/textview")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//android.widget.TextView[@text='YESTERDAY']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='THIS WEEK']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='THIS WEEK']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='LAST WEEK']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='LAST MONTH']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='THIS YEAR']")).click();
	  driver.findElement(By.xpath("//android.widget.TextView[@text='LAST YEAR']")).click();
	  
	  
	  
	  
	//  driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.widget.CompoundButton[@index='0']")).sendKeys("1");
	 
}
	}
