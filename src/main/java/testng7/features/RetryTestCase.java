package testng7.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestCase {
	  @Test
	  public void sampleTest() {
		 // throw new RuntimeErrorException(null);
		  Assert.assertTrue(false);
	  }
	  @Test
	  public void sampleTest1() {
		  Assert.assertTrue(true);
	  }
	  
	}
