//**********  Project Structure **************//

This All Project structure based on page object model approach/ framework Using Maven, Java
1.	Src/main/java
	com.cocoin.core 
           (This Package Define the 2 classes 
                     1.Driver.java   --->> Define the Driver by factory pasttern
                     2.Testbase.java --->> This is the main class for whole project every class in sub packeg                                       will inherit from this class )
	com.cocoin.ui.screens
           (This Package Define the 4 classes 
                     1.AddExpense.java          --->> Elemnet define in this section for Add Expense UI
                     2.Login.java               --->> Elemnet define in this section for Login UI
                     3.LunchScreen.java         --->> Elemnet define in this section for LunchScreen UI
                     4.VerifyAddedExpense.java  --->> Elemnet define in this section for VerifyAddedExpense                                                             UI
            (This Package Define the 4 classes                                          
	com.cocoin.util
                     1.Swipe.java               --->> All Swipe Action are in this class fro swipe 

2.	src/test/java
        com.cocoin.testcases
                    1.TC001_LunachApp.java     --->> Test case LunachApp will execute from this class using                                                               2.TC002_LunachAppWithLogin.java    --->> Test case LunachAppWithLogin will execute from this class using testNG
                    3.TC003_AddExpense.java   --->> Add AddExpense Will Execute by this calss usign TestNg engine
                    4.TC004_VerifyAddedExpense.java   --->> Add VerifyAddedExpense Will Execute by this calss usign TestNg engine
        

3.	com.cocoin.testcases List of teste cases likes (TC001, TCOO2 etc).You can Run the Test cases according to test case number This folder has Test cases and you can run All test cases 

How to Run this project?

•	Install Eclipse id
•	Import this Project
•	Install Appium Desktop application and configured with window or mac.
•	GO To TestCases package and run all the testcases
