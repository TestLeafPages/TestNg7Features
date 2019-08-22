package testng7.features;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void testcase1() {
		System.out.println("testcase1");
		System.out.println(Thread.currentThread().getId());

	}
	

}
