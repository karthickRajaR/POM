package testCase;

import org.testng.annotations.Test;

import pages.GitLogin;
import seleniumBase.ProjectSpecificMethods;

public class TC_001_LOGIN extends ProjectSpecificMethods{
	
	@Test
	public void runlogin() {
		new GitLogin().enterUserName().enterPassword().clicklogin().title();
	}
}
