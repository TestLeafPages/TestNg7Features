package testng7.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTest {
	@Test
	  public void sampleTest() {
		 // throw new RuntimeErrorException(null);
		  Assert.assertTrue(false);
	  }
	  @Test(dependsOnMethods="sampleTest")
	  public void sampleTest1() {
		  Assert.assertTrue(true);
	  }
	  @Test
	  public void sampleTest2() {
		  Assert.assertTrue(true);
	  }

}
