package com.cocoin.testcases;

import org.testng.annotations.Test;
import com.cocoin.core.TesstBase;
import com.cocoin.ui.screens.LunchScreen;
import com.cocoin.util.Swipe;

public class TC001_LunachApp extends TesstBase {
	LunchScreen app;
	Swipe swipeHorizentally;
	
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
	}
}
