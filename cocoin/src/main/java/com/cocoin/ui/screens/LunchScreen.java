package com.cocoin.ui.screens;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cocoin.core.TesstBase;

public class LunchScreen extends TesstBase{

// Launch App 
	public void LunchApp() {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  wait = new WebDriverWait(driver, 5000);
	  wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.RelativeLayout")));
	}
	
	
	
	
}
