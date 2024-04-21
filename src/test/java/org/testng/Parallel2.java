package org.testng;

import org.testng.annotations.Test;

public class Parallel2 {

@Test
private void tc4() {
System.out.println("test4 -"+ Thread.currentThread().getName());
}

@Test
private void tc5() {
System.out.println("test5 -"+Thread.currentThread().getName());
}
@Test
private void tc6() {
System.out.println("test6 -"+Thread.currentThread().getName());
}



}
