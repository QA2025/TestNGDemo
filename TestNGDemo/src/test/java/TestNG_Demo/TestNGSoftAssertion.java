
package TestNG_Demo;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertion {
	
	SoftAssert softassert = new SoftAssert();
	SoftAssert softassert2 = new SoftAssert();
	
	@Test(priority =1, groups= "smoke test") //priority is used to follow execution order for each method
	void test1() {
		
		softassert.assertTrue(true);
		softassert.assertEquals("random", "random");//assert passed
		System.out.println("assert test run passed");	
		softassert.assertAll();// enables to pass through each assert even if it fails.
	
	}
	
	@Test(priority =2, groups= "smoke test")
	void test2() {
		
		softassert2.assertFalse(true);// assert will fail
		softassert2.assertEquals("random1","random"); //assert fails
		System.out.println("assert test run failed");	
		softassert2.assertAll();// enables to pass through each assert even if it fails.
	
	}
}
