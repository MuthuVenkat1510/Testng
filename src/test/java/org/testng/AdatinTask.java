package org.testng;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdatinTask extends BaseClass {

	@BeforeMethod
	public static void beforeClass() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	public static void afterClass() {
		Date d = new Date();
		System.out.println(d);
	}

	@BeforeClass
	public void before() {
		launchBrowser();
		toMaximize();
		loadUrl(" http://www.adactin.com/HotelApp/");
	}

	@AfterClass
	public void after() {
		toQuit();
	}

	@Parameters({ "Username", "Password", "Firstname", "Lastname", "Address", "Creditnumber", "cvv" })
	@Test
	public void tc1(String v1, String v2, String v3, String v4, String v5, String v6, String v7)
			throws InterruptedException {
		WebElement txtUserName = driver.findElement(By.id("username"));
		fillText(txtUserName, v1);
		WebElement txtUserPass = driver.findElement(By.id("password"));
		fillText(txtUserPass, v2);
		WebElement btnLgn = driver.findElement(By.id("login"));
		toClick(btnLgn);
		WebElement locationDrop = driver.findElement(By.xpath("//select[@id='location']"));
		toSelectByIndex(locationDrop, 1);
		WebElement hotelDrop = driver.findElement(By.xpath("//select[@id='hotels']"));
		toSelectByIndex(hotelDrop, 1);
		WebElement roomTypeDrop = driver.findElement(By.xpath("//select[@id='room_type']"));
		toSelectByIndex(roomTypeDrop, 1);
		WebElement roomNoDrop = driver.findElement(By.xpath("//select[@id='room_nos']"));
		toSelectByIndex(roomNoDrop, 1);
		WebElement adultRoomDrop = driver.findElement(By.xpath("//select[@id='adult_room']"));
		toSelectByIndex(adultRoomDrop, 2);
		WebElement childRoomDrop = driver.findElement(By.xpath("//select[@id='child_room']"));
		toSelectByIndex(childRoomDrop, 1);
		WebElement serachBtn = driver.findElement(By.xpath("//input[@id='Submit']"));
		toClick(serachBtn);
		WebElement radiobtn = driver.findElement(By.name("radiobutton_0"));
		toClick(radiobtn);
		WebElement ctnbtn = driver.findElement(By.name("continue"));
		toClick(ctnbtn);
		WebElement ccTyoe = driver.findElement(By.name("cc_type"));
		toSelectByIndex(ccTyoe, 3);
		WebElement ccMnth = driver.findElement(By.name("cc_exp_month"));
		toSelectByIndex(ccMnth, 1);
		WebElement ccexpYear = driver.findElement(By.name("cc_exp_year"));
		toSelectByIndex(ccexpYear, 5);
		WebElement firstName = driver.findElement(By.name("first_name"));
		fillText(firstName, v3);
		WebElement lastName = driver.findElement(By.name("last_name"));
		fillText(lastName, v4);
		WebElement address = driver.findElement(By.name("address"));
		fillText(address, v5);
		WebElement ccnum = driver.findElement(By.name("cc_num"));
		fillText(ccnum, v6);
		WebElement ccvvv = driver.findElement(By.name("cc_cvv"));
		fillText(ccvvv, v7);
		WebElement bookBtn = driver.findElement(By.name("book_now"));
		toClick(bookBtn);
		Thread.sleep(7000);
		WebElement orderNo = driver.findElement(By.name("order_no"));
		String string = togetattributevalue(orderNo);
		System.out.println(string);
	}

}
