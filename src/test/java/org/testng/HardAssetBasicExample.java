package org.testng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class HardAssetBasicExample {
@Test
private void tc2() {
System.out.println("test2");
Assert.assertTrue(15>20, "check the condition");
System.out.println("test22");
} 
@Test
private void tc3() {
System.out.println("test3");
Assert.assertFalse(15>20, "test33");
}
@Test
private void tc1() {
System.out.println("test1");
Assert.assertEquals("Java", "java", "check the condition");
System.out.println("test111");
}
}
