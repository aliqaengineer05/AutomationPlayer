package com.cocoin.ui.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cocoin.core.TesstBase;

import io.appium.java_client.android.AndroidDriver;

public class AddExpense extends TesstBase {
	// Add Expense Category Lunch
	@FindBy(xpath = "//android.widget.TextView[@text='Lunch']")
	WebElement Lunch;
	// Click On Keypad to press Button 1   
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	WebElement Amount01;
	// Click On Keypad to press Button 2   
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	WebElement Amount02;
	// Click On Keypad to press Button 3   
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	WebElement Amount03;
	// Add Expense Category Dinner
	@FindBy(xpath = "//android.widget.TextView[@text='Dinner']")
	WebElement Dinner;
	// Click On Keypad to press Button 1  
	@FindBy(xpath="//android.widget.FrameLayout[@index='11']")
	WebElement SubmitButton;
	// Click On Keypad to press SubmitButton 
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	WebElement Amount1;
	// Click On Keypad to press Button 3   
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	WebElement Amount2;
	// Click On Keypad to press Button 4   
	@FindBy(xpath="//android.widget.TextView[@text='1']")
	WebElement Amount3;
	// Click On Keypad to press Submit
	@FindBy(xpath="//android.widget.FrameLayout[@index='11']")
	WebElement Submit;
	
	public AddExpense(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddExpenseCategory() throws InterruptedException {
		this.Lunch.click();
		this.Amount01.click();
		this.Amount02.click();
		this.Amount03.click();
		this.SubmitButton.click();
		this.Dinner.click();
		this.Amount1.click();
		this.Amount2.click();
		this.Amount3.click();
		this.Submit.click();
	}
	
}
