package org.testng;

import org.testng.annotations.Test;

public class Parallel1 {
@Test
private void tc1() {
System.out.println("test1 -"+ Thread.currentThread().getName());
}

@Test
private void tc2() {
System.out.println("test2 -"+Thread.currentThread().getName());
}
@Test
private void tc3() {
System.out.println("test3 -"+Thread.currentThread().getName());
}

}
