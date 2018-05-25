package com.cocoin.ui.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cocoin.core.TesstBase;
import io.appium.java_client.android.AndroidDriver;

public class VerifyAddedExpense extends TesstBase {

	
	// Click On Click on Hamburger
			@FindBy(id="com.nightonke.cocoin:id/content_hamburger")
			WebElement Hamburger;
	// Click On Click on Number01		
			@FindBy(id="com.nightonke.cocoin:id/textview")
			WebElement Number01;
	// Click On Click on Number02	
			@FindBy(id="com.nightonke.cocoin:id/textview")
			WebElement Number02;
	// Click On Click on Number03	
			@FindBy(id="com.nightonke.cocoin:id/textview")
			WebElement Number03;
	// Click On Click on Number04	
			@FindBy(id="com.nightonke.cocoin:id/textviewr")
			WebElement Number04;
	// Click On Click on YESTERDAY	
			@FindBy(xpath="//android.widget.TextView[@text='YESTERDAY']")
			WebElement YESTERDAY;
	// Click On Click on THISWEEK	
			@FindBy(xpath="//android.widget.TextView[@text='THIS WEEK']")
			WebElement THISWEEK;
	// Click On Click on LASTWEEK	
			@FindBy(xpath="//android.widget.TextView[@text='LAST WEEK']")
			WebElement LASTWEEK;
	// Click On Click on THISMONTH	
			@FindBy(xpath="//android.widget.TextView[@text='THIS MONTH']")
			WebElement THISMONTH;
	// Click On Click on LASTMONTH	
			@FindBy(xpath="//android.widget.TextView[@text='LAST MONTH']")
			WebElement LASTMONTH;
	// Click On Click on THISYEAR	
			@FindBy(xpath="//android.widget.TextView[@text='THIS YEAR']")
			WebElement THISYEAR;
	// Click On Click on LASTYEAR	
			@FindBy(xpath="//android.widget.TextView[@text='LAST YEAR']")
			WebElement LASTYEAR;

	// Page Factory will initilze the driver with this driver. 
public VerifyAddedExpense(AndroidDriver driver) {
				TesstBase.driver = driver;
				PageFactory.initElements(driver, this);
			}
  //  VerifyExpense	Method will perform the actions
public void VerifyExpense(){
				this.Hamburger.click();
				this.Number01.click();
				this.Number02.click();
				this.Number03.click();
				this.Number04.click();
				this.YESTERDAY.click();
				this.THISWEEK.click();
				this.LASTWEEK.click();
				this.LASTMONTH.click();
				this.THISYEAR.click();
				this.LASTYEAR.click();	
			}
			
}
