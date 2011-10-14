package clinic.tests;


import org.testng.annotations.Test;

import clinic.TestHelper;
import clinic.pageObjects.PageHome;


public class testFirst extends TestHelper {
	
	/**
	 * Creating test data
	 */
//	@DataProvider(name = "dp")
//	public Object[][] createData1() {
//	 return new Object[][] {
//	   { "http://painclinician.com/"}
//	 };
//	}

	/**
	 * Bay standard order
	 */
	@Test
//	(dataProvider = "dp")
	public void makeOrder() {
		new PageHome()
		.clickProgects()
		;
	}
	

}
