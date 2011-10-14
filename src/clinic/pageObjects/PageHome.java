package clinic.pageObjects;

import org.openqa.selenium.By;

import clinic.PageObjectHelper;

public class PageHome extends PageObjectHelper {
	
	public PageHome() {
		open(server);
		
		//Check page title
		isTitleContainsAssert("Home");
	}
	
	public PageProgects clickProgects() {
		click(By.xpath("//ul/li[2]/a"));
		return new PageProgects();
	}
	
}
