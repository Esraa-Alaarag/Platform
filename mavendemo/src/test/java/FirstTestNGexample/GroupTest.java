package FirstTestNGexample;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = {"group1"})
	public void firstTest() {
			System.out.println("I am in first group TestNG test");
	}
	@Test(groups = {"group1"})
	public void secondTest() {
			System.out.println("I am in second group TestNG test");
	}
			
	
}
