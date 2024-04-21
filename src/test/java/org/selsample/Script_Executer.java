package org.selsample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_Executer {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	
	
	JavascriptExecutor j = (JavascriptExecutor)driver;
	j.executeScript("arguments[0].setAttribute('value','gowtham')", email);
	
	
	
	
	
}
}
