package startProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import framework.Framework;

public class TestHelper extends Framework {
	//Default values
	protected static final String server_default = "http://cms.2droid.net/";
	
	//Current values
	protected static String server = server_default;
	
	/**
	 * Getting driver type from xml
	 * @param DRIVER int - number of driver
	 * @param SERVER String - url of server (without / at end)
	 * @param USER String - user name for login
	 * @param PASS String - password
	 */
	@BeforeSuite(alwaysRun = true)
	@Parameters({"DRIVER", "SERVER"})
	protected static void beforeSuite(@Optional("DRIVER") String DRIVER, 
			@Optional("SERVER")String SERVER) {
		
		//Time that we wait for page
		WaitTime = 5; //sec
		
		//Path to screen shot folder
		PathToFolder = "c:\\tempTest\\"; 
		
		//Selecting with what driver to work with
		if (!DRIVER.equals("DRIVER")) {
			switch (Integer.parseInt(DRIVER)) {
			case 1:
				driver = new FirefoxDriver();
				break;
			case 2:
				driver = new InternetExplorerDriver();
				break;
			case 3:
				driver = new ChromeDriver();
				break;
			case 10:
				driver = new HtmlUnitDriver();
		    	((HtmlUnitDriver) driver).setJavascriptEnabled(true);
				break;
			case 11:
				driver = new HtmlUnitDriver();
				break;
			default:
				driver = new FirefoxDriver();
				break;
			}
		} else { //default 
			driver = new FirefoxDriver();
		}
		
		
		//Sawing wait time
		wait = new WebDriverWait(driver, WaitTime);
		
		//Setting server
//		if (SERVER.length() > 0 
//				&& !SERVER.equals("SERVER")) server = SERVER;
//		
//		//Setting user
//		if (USER.length() > 0
//				&& !USER.equals("USER")) user = USER;
		
	}
	
	/**
	 * Closing browser after class
	 */
	@AfterSuite(alwaysRun = true)
    protected static void afterSuite() {
		//Close session
	    driver.close();
    }
	
}
