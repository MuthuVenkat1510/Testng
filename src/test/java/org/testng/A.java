package org.testng;

import org.testng.annotations.Test;

public class A {
	@Test(priority = -12)
	private void tc1() {
		System.out.println("test1");
	}

	@Test(enabled = false, priority = 1)
	private void tc3() {
		System.out.println("test3");
	}

}
