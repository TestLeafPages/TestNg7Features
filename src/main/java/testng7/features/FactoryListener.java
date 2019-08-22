package testng7.features;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class FactoryListener implements ITestListener {
	
	public void onStart(ITestContext context) {
		String name = context.getName();
		
		//System.out.println(name);
	}

}
