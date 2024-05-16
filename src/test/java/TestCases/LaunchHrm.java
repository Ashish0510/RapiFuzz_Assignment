package TestCases;

import org.testng.annotations.Test;

import PomClasses.CreateEmployee_Page;
import PomClasses.LoginPage;
import PomClasses.LogoutPage;
import Utility.AlldataProviders;

public class LaunchHrm extends BaseClass {

	@Test(dataProvider = "logindetails", dataProviderClass = AlldataProviders.class, priority = 0)
	public void LoginTestCasePositive(String usernam, String password) throws InterruptedException {

		LoginPage Log = new LoginPage(driver);
		logger.info("Login Started");
		Log.Login(usernam, password);
		logger.info("Login done successfully");

		//logger.info("employee adding process started");

		//CreateEmployee_Page employee = new CreateEmployee_Page(driver);

	//	employee.FormFill();

		/*
		 * LogoutPage logoutPage=new LogoutPage(driver); logoutPage.Logout();
		 */

	}

	/*
	 * @Test (dataProvider = "wronglogindetails",dataProviderClass =
	 * AlldataProviders.class,priority=1) public void LoginTestCaseNegative(String
	 * usernamee,String passwordd)throws InterruptedException{ LoginPage Log=new
	 * LoginPage(driver); Thread.sleep(5000); logger.info("Login Started");
	 * Log.Login(usernamee,passwordd); logger.info("Login Failed"); LogoutPage
	 * logoutPage=new LogoutPage(driver); logoutPage.Logout();
	 * 
	 * }
	 */

}
