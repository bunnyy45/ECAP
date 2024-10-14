package testngGroup;

import org.testng.annotations.Test;

public class TestngGroup {
	@Test (groups= {"smoke"})
	public void test1() {
		System.out.println("test case 1");
	}
	@Test (groups= {"regression"})
	public void test2() {
		System.out.println("test case 2");
	}
	@Test (groups= {"smoke"})
	public void test3() {
		System.out.println("test case 3");
	}
	@Test (groups= {"regression"})
	public void test4() {
		System.out.println("test case 4");
	}
}
