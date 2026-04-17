package com.example.testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pageObjects.homePage;
import com.example.testComponants.BaseTest;

public class loginTest extends BaseTest
{
@Test
public void login() throws Exception
{
    driver.get("https://www.amazon.in/");
    homePage homePage=new homePage(driver);
    String s=homePage.getElectronicsText();
    Assert.assertEquals(s, "Electronics");
}
}
