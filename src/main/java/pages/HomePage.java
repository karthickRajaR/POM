package pages;

import seleniumBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public void title() {
		System.out.println(driver.getTitle());
	}

}

