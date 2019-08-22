package testng7.features;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest {
	private String param = "";

	public FactoryTest(String param) {
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before SimpleTest class executed.");
	}

	@Test
	public void testMethod() {
		System.out.println("testMethod parameter value is: " + param);
	}

	@Factory
	public Object[] factoryMethod(ITestContext context) {

		String name = context.getName();
		System.out.println(name);

		return new Object[] { new FactoryTest("one"), new FactoryTest("two") };
	}
}
