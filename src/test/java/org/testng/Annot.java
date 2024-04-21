package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {
	@BeforeSuite
	private void beforesuite() {
		System.out.println("@before suite");

	}

	@BeforeTest
	private void bfTest() {
		System.out.println("@beforeTest");
	}

	@BeforeClass
	private void beClass() {
		System.out.println("@BeforeClass");
	}

	@BeforeGroups
	private void befGroup() {
		System.out.println("@beforeGroups");
	}

	@BeforeMethod
	private void befMrthod() {
		System.out.println("@BeforeMethods");
	}

	@Test
	private void tc1() {
		System.out.println("test1");

	}

	@AfterMethod
	private void aftMethod() {
		System.out.println("@aterMethod");
	}

	@AfterGroups
	private void aftereGruops() {
		System.out.println("@afterMethod");

	}

	@AfterClass
	private void aterClass() {
		System.out.println("@afterClass");
	}

	@AfterTest
	private void afterTest() {
		System.out.println("@afterClass");
	}

	@AfterSuite
	private void aftersuite() {
		System.out.println("@AfterSuite");
	}
}
