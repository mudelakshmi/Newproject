package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeout {

	@Test(invocationTimeOut =2,expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void test() {
		
		int i=2;
		while(i<=2) {
			System.out.println(i);
			
		}

	}

}
