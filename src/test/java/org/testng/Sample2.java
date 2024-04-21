package org.testng;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(priority = -12)
	private void tc1() {
		System.out.println("test1");
	}

	@Test(enabled = false, priority = 1)
	private void tc3() {
		System.out.println("test3");
	}

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

	@Test
	private void tc7() {
		System.out.println("test7");
	}

	@Test
	private void tc8() {
		System.out.println("test8");
	}

	@Test
	private void tc10() {

	}
}
