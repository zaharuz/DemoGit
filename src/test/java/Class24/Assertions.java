package Class24;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test
	public void testHardAssert() {
		String actualRslt = "Hello";
		Assert.assertEquals(actualRslt, "Hello", "Message for indication, method = testHardAssert()");
		
		boolean checkedValue = true;
		Assert.assertTrue(checkedValue, "Checking boolean");
		boolean checkedValueFalse = false;
		Assert.assertFalse(checkedValueFalse, "Checking false boolean");
		//also possible with numeric expresions
		Assert.assertFalse(4>3, "4>3 example");
	}
	
	@Test
	public void testSoftAssert() {
		SoftAssert softAssert = new SoftAssert();
		
		String actualRslt = "Hello";
		softAssert.assertEquals(actualRslt, "Hello", "Message for indication, method = testHardAssert()");
		
		boolean checkedValue = true;
		softAssert.assertTrue(checkedValue, "Checking boolean");
		boolean checkedValueFalse = false;
		softAssert.assertFalse(checkedValueFalse, "Checking false boolean");
		//also possible with numeric expresions
		softAssert.assertFalse(4>3, "4>3 example");
		
		softAssert.assertAll();
	}

	@Test
	public void testMixedAssert() {
		SoftAssert softAssert = new SoftAssert();
		//1
		String actualRslt = "Hello";
		softAssert.assertEquals(actualRslt, "Hello", "Message for indication, method = testHardAssert()");
		//2 assuming this is important, you want to stop the test, if this fails, use Assert, instead of softAssert
		boolean checkedValue = true;
		Assert.assertTrue(checkedValue, "Checking boolean");
		//3
		boolean checkedValueFalse = false;
		softAssert.assertFalse(checkedValueFalse, "Checking false boolean");
		//4
		//also possible with numeric expresions
		softAssert.assertFalse(4>3, "4>3 example");
		
		softAssert.assertAll();
	}
}
