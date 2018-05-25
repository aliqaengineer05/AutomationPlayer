package com.cocoin.testcases;

import org.testng.annotations.Test;

import com.cocoin.core.TesstBase;
import com.cocoin.ui.screens.AddExpense;
import com.cocoin.ui.screens.Login;
import com.cocoin.ui.screens.LunchScreen;
import com.cocoin.ui.screens.VerifyAddedExpense;
import com.cocoin.util.Swipe;

public class TC004_VerifyAddedExpense extends TesstBase {

	LunchScreen app;
	Swipe swipeHorizentally;
	Login login;
	AddExpense Expense;
	VerifyAddedExpense verifyExpense;
	@Test
	public void verifyLaunchApp() throws Exception {
		
		//log.info("=======Starting TC001_LunachApp test========");
		app = new LunchScreen();
		app.LunchApp();
		swipeHorizentally = new Swipe();
		Thread.sleep(3000);
		Swipe.swipe();
		Thread.sleep(3000);
		Swipe.swipe();
		Thread.sleep(3000);
		Swipe.swipeHorizontal(driver, 0.9,0.01,0.5,200);
		Thread.sleep(3000);
		Swipe.swipeHorizontally(driver, 0.9,0.01,0.5,200);
		login = new Login(driver);
		login.Password();
		verifyExpense = new VerifyAddedExpense(driver);
		verifyExpense.VerifyExpense();
	
	}
}
