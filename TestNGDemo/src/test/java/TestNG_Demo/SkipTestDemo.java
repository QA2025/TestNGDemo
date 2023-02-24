package TestNG_Demo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestDemo {
	
	boolean datasetup = false;
	
	//method 1 -- to skip test method
	@Test(enabled=false) 
	public void skiptest1() {
		System.out.println("Skipping this test as it is not complete.");
	}
	
	//method 2 -- to skip test method
	@Test
	public void skiptest2() {
		System.out.println("Skipping this test forcefully.");
		throw new SkipException("Skipping test");
	}
	
	@Test
	public void skiptest3() {
		System.out.println("Skipping this test based on condition.");
		
		if(datasetup==true) {
			System.out.println("Test Case Executed.");
		}
		else {
			System.out.println("This Test Case has not been executed due to datasetup not complete.");
			throw new SkipException("Test Case Skipped.");
		}
	}
}
