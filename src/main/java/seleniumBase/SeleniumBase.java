package seleniumBase;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import design.Browser;
import design.Element;

import utils.Reporter;

public class SeleniumBase extends Reporter implements Browser, Element{

	public RemoteWebDriver driver;
	public WebDriverWait wait;
	
	public void click(WebElement ele) {
		
		String text="";
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			reportStep("The Element "+text+" clicked", "pass"); 
		} catch (StaleElementReferenceException e) {
			reportStep("The Element "+text+" could not be clicked", "fail");
			throw new RuntimeException();
		} 
		
	}
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}
	public void clear(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public void clearAndType(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			reportStep("The Data :"+data+" entered Successfully", "pass");
		} catch (ElementNotInteractableException e) {
			reportStep("The Element "+ele+" is not Interactable", "fail");
			throw new RuntimeException();
		}
		
	}
	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}
	public boolean verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verifyDisappeared(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public RemoteWebDriver startApp(String url) {
		// TODO Auto-generated method stub
		return null;
	}
	public RemoteWebDriver startApp(String browser, String url) {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement locateElement(String locatorType, String value) {
		// TODO Auto-generated method stub
		return null;
	}
	public WebElement locateElement(String value) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<WebElement> locateElements(String type, String value) {
		// TODO Auto-generated method stub
		return null;
	}
	public void switchToAlert() {
		// TODO Auto-generated method stub
		
	}
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}
	public void typeAlert(String data) {
		// TODO Auto-generated method stub
		
	}
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}
	public void switchToWindow(String title) {
		// TODO Auto-generated method stub
		
	}
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		
	}
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub
		
	}
	public void defaultContent() {
		// TODO Auto-generated method stub
		
	}
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}
	public void close() {
		// TODO Auto-generated method stub
		
	}
	public void quit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}

}