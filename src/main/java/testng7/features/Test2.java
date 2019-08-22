package testng7.features;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testcase2() {
		System.out.println("testcase2");
		System.out.println(Thread.currentThread().getId());

	}
}
