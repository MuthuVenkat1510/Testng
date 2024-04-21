package org.testng;

import org.testng.annotations.Test;

public class G2 {
	@Test(groups= {"Smoke"})
	private void tc2() {
		System.out.println("test2");
	}@Test(groups= {"regards"})
	private void tc4() {
		System.out.println("test4");
	}@Test(groups= {"regards","Smoke"})
	private void tc6() {
		System.out.println("test6");
	}

}
