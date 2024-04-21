package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing extends BaseClass {
	@BeforeClass

	public void BeforeClass() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");

	}

	@BeforeMethod
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	public void AterClass() {
		toQuit();
	}

	@AfterMethod
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	@Parameters({"Username","Password"})
	@Test
	public void tc1(String value1, String value2) {
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys(value1);
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(value2);
		
//LoginPojo l = new LoginPojo();
//fillText(l.getTxtEmail(), value1);
//fillText(l.getTxtpass(), value2);
	}
}
