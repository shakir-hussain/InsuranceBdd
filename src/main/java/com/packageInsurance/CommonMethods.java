package com.packageInsurance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	public void hoverOver(WebElement element,WebDriver driver) {
		Actions actions=new Actions(driver);
		BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
		actions.moveToElement(element).build().perform();
	}
	
	public void dropDown(WebElement element, String value) {
		BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.selectByValue(value);
	}
	public void clicking(WebElement element) {
	BaseClass.wait.until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	}
	public void enterKeys(WebElement element,String string) {
		BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(string);
	}
	public void clearing(WebElement element) {
		BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
	}
}
