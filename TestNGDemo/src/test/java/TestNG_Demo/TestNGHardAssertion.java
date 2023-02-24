package TestNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHardAssertion {

	@Test 
	void demoTest() {
		
		int x = 15;
		int y = 12;
		int z = 3;
		
		Assert.assertTrue(true);
		Assert.assertEquals(x,(y+z) );
		Assert.assertEquals("Zoro", "Zoro");
		System.out.println("Test Case passed.");
	}
}
