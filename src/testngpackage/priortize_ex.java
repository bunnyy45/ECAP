package testngpackage;

import org.testng.annotations.Test;

public class priortize_ex {
	
	@Test (invocationCount=0)   //it will not execute this test case or (enabled=false) can also be used
	public void testcase() {
		System.out.println("test case 0");
	}
	@Test 
	public void testcase1() {
		System.out.println("testcase1");
	}
	@Test (priority=0)
	public void testcase2() {
		System.out.println("testcase2");
	}
	@Test (priority=-1)
	public void testcase3() {
		System.out.println("testcase3");
	}
		
		
		@Test (priority=2) // test case
		public void testcase4() {
			System.out.println("test case 4");
	}

}
