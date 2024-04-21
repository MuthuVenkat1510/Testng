package org.testng;

import org.testng.annotations.Test;

public class G3 {
	@Test(groups= {"Smoke"})
	private void tc9() {
		System.out.println("test9");
	}
	@Test(groups= {"regards"})
	private void tc8() {
		System.out.println("test8");
	}
}
