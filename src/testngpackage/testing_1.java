package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing_1 {
	@BeforeMethod
	public void launchbrowser() {
		System.out.println("launched-browser");
	}
	
	@AfterMethod
	public void closebrowser() {
		System.out.println("closed =browser");
	}
	
	@Test
	public void login() {
		System.out.println("login successful");
	}
	@Test
	public void logout() {
		System.out.println("logout successful");
	}

}
