package Selenium;

import org.testng.annotations.Test;

public class Alphabetorder {
	@Test(priority = 6)
	public void method_a() {
		System.out.println("iam in method a");
	}

	@Test(priority = 5)
	public void method_e() {
		System.out.println("iam in method e");
	}

	@Test(priority = 1)
	public void method_c() {
		System.out.println("iam in method c");
	}

	@Test(priority = 3)
	public void method_d() {
		System.out.println("iam in method d");
	}

	@Test(priority = 2)
	public void method_b() {
		System.out.println("iam in method b");
	}

	@Test(priority = 4)
	public void method_z() {
		System.out.println("iam in method z");
	}
	@Test
	public void method_n() {
		System.out.println("iam in method n");
	}
	@Test
	public void method_h() {
		System.out.println("iam in method h");
	}
	@Test(priority = 4)
	public void method_i() {
		System.out.println("iam in method i");
	}
}
