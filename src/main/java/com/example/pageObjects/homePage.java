package com.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    public WebDriver driver;
    	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    @FindBy(xpath="//a[contains(text(),'Electronics')]")
    public WebElement electronics;




    public String getElectronicsText() {
       return electronics.getText();
    }

}
