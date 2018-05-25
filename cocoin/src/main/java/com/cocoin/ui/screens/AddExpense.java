package com.cocoin.ui.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cocoin.core.TesstBase;
import com.cocoin.core.Driver;

import io.appium.java_client.android.AndroidDriver;

public class AddExpense extends TesstBase {
	// Add Expense Category
	@FindBy(xpath = "com.nightonke.cocoin:id/tag_image")
	WebElement Category;
	
	@FindBy(id = "com.nightonke.cocoin:id/textview")
	WebElement Amount01;
	
	@FindBy(id = "com.nightonke.cocoin:id/textview")
	WebElement Amount02;
	
	@FindBy(id = "com.nightonke.cocoin:id/textview")
	WebElement Amount03;
	
	@FindBy(xpath = "//android.widget.LinearLayout[@index='11']")
	WebElement setting;
	
	
	public AddExpense(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddExpenseCategory() throws InterruptedException {
		this.Category.click();
		this.Amount01.click();
		this.Amount02.click();
		this.Amount03.click();
	}
	
}
