package org.testng;

import org.testng.annotations.Test;

public class B {
	@Test(invocationCount = 3)
	private void tc4() {
		System.out.println("test4");
	}

	@Test(priority = 5)
	private void tc5() {
		System.out.println("test5");
	}

	@Test
	private void tc6() {
		System.out.println("test6");
	}
}
