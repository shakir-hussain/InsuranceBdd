package com.pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.packageInsurance.BaseClass;
import com.packageInsurance.CommonMethods;

public class ElementsPage {

	public ElementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle '])[1]")
	public WebElement autoInsuranceTab;
	@FindBy(xpath = "//span[text()='Find cheaper car insurance']")
	public WebElement cheaperCarInsurance;
	@FindBy(xpath = "//input[@id='aMUjDXmA-n-zip-input']")
	public WebElement zipcode;
	@FindBy(xpath = "//select[@id='aMUjDXmA-n-age-input']")
	public WebElement selectAge;
	@FindBy(xpath = "//select[@id='aMUjDXmA-n-carrier']")
	public WebElement currentlyInsured;
	@FindBy(xpath = "//button[@id='aMUjDXmA-submit']")
	public WebElement getQuotes;
	@FindBy(id = "button_2_dohavemultipledrivers")
	public WebElement noMultipleDrivers;
	@FindBy(id = "button_2_dohavemultiplevehicles")
	public WebElement noMultipleVehicles;
	@FindBy(xpath = "//input[@id='BirthMonth']")
	public WebElement month;
	@FindBy(xpath = "//input[@id='BirthDay']")
	public WebElement day;
	@FindBy(xpath = "//input[@id='BirthYear']")
	public WebElement year;
	@FindBy(xpath = "//button[@id='birthmonth_next']")
	public WebElement nextButton;
	@FindBy(id = "InsuranceCarrier_title")
	public WebElement currentInsurerTitle;
	
	public void  autoInsuranceMethod(CommonMethods cm,WebDriver driver) {
		cm.hoverOver(autoInsuranceTab,driver);
	}
	public void cheaperCarInsurnceMethod(CommonMethods cm) {
		cm.clicking(cheaperCarInsurance);
	}
	public void zipCodeMethod(CommonMethods cm) {
		cm.clicking(zipcode);
		cm.clearing(zipcode);
		cm.enterKeys(zipcode, "10472");
	}
	public void selectAgeMethod(CommonMethods cm) {
		cm.dropDown(selectAge, "30");
	}
	public void currentlyInsuredMethod(CommonMethods cm) {
		cm.dropDown(currentlyInsured, "GEICO");
	}
     public void getQuotesMethod(CommonMethods cm) {
    	 cm.clicking(getQuotes);
     }
     public void multipleDriversMethod(CommonMethods cm) {
    	Set<String> allWindowHandles =BaseClass.driver.getWindowHandles();
    	
    	//to extract window handles
    	String parentWindow=(String) allWindowHandles.toArray()[0];
    	String childWindow=(String) allWindowHandles.toArray()[1];
    	 
    	 
    	 cm.clicking(noMultipleDrivers);
    	 
     }
}
