package FirstTestNGexample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeMethod
	public void beforemethod() {
			System.out.println("I am in before method  TestNG test");
	}
	@BeforeTest
	public void beforeTest() {
			System.out.println("I am in before test TestNG test");
	}
	@Test
	public void firstTest() {
			System.out.println("I am in first TestNG test");
	}
	@AfterMethod
	public void aftermethod() {
			System.out.println("I am in after method  TestNG test");
	}
	@AfterTest
	public void afterTest() {
			System.out.println("I am in after test TestNG test");
	}
}
