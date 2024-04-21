package org.testng;

import org.testng.annotations.Test;


public class G1 {
	@Test(groups= {"regards","Smoke"})
	private void tc1() {
		System.out.println("test1");
	}
	@Test(groups= {"regards"})
	private void tc5() {
		System.out.println("test5");
	}
	@Test(groups= {"Smoke"})
	private void tc7() {
		System.out.println("test7");
	}
}
