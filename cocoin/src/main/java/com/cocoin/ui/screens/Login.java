package com.cocoin.ui.screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cocoin.core.Driver;

import io.appium.java_client.android.AndroidDriver;

public class Login extends Driver {
	
	// Click On Keypad to press Button 1
		@FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number1;
		
	// Click On Keypad to press Button 2
	    @FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number2;

	// Click On Keypad to press Button 3   
	    @FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number3;
		
	// Click On Keypad to press Button 4   
	    @FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number4;	
		
	// Click On Submit Button  
		@FindBy(xpath="com.nightonke.cocoin:id/frame_layout")
		WebElement submitButton;	
		
		
//** Re-Confirm the Password To match the Both password 
		
	// Click On Keypad to press Button 1   
		@FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number01;
			
	// Click On Keypad to press Button 2   
		@FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number02;

	// Click On Keypad to press Button 3   
		@FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number03;
			
	// Click On Keypad to press Button 4   
		@FindBy(xpath="//android.widget.TextView[@text='1']")
		WebElement Number04;	
			
	// Click On Submit Button  
		@FindBy(xpath="com.nightonke.cocoin:id/frame_layout")
		WebElement ConfirmButton;
		
		
		public Login(AndroidDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
   //  Type your password to protect your Book.
		public void Password() throws InterruptedException {
			Thread.sleep(2000);
			this.Number1.click();
			this.Number2.click();
			this.Number3.click();
			this.Number4.click();
			Thread.sleep(1000);
			this.Number01.click();
			this.Number02.click();
			this.Number03.click();
			this.Number04.click();
		}
			
}
