package com.cocoin.util;

import org.openqa.selenium.Dimension;
import com.cocoin.core.TesstBase;
import com.cocoin.core.Driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;


public class Swipe extends TesstBase{
// These two Methods Performs swipeHorizontal  
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
public static void swipe() throws Exception {
	Dimension size = driver.manage().window().getSize();
	  System.out.println(size);
	  driver.swipe(size.width-1,  size.height/2, 1,  size.height/2, 200);
	}
}
