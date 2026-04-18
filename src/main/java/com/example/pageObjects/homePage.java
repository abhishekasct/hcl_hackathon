package com.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.example.abstractComponants.abstractComponants;

public class homePage extends abstractComponants{
    public WebDriver driver;
    	public homePage(WebDriver driver) {
            super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    

    @FindBy(xpath="//div[@id='nav-xshop']//a[text()='Mobiles']")
    public WebElement mobile;

    public void clickOnMobile(){
        clickOnElement(mobile);
    }


  

}
