package pages;

import org.openqa.selenium.WebElement;

import seleniumBase.ProjectSpecificMethods;

public class GitLogin extends ProjectSpecificMethods {

	
	public GitLogin enterUserName() {
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;	
	}
	public GitLogin enterPassword(){
			driver.findElementById("password").sendKeys("leaf@12");
			return this;
	}	
	public HomePage clicklogin() {
		driver.findElementById("buttonLogin").click();
		return new HomePage();
	}
	
	
	
}


