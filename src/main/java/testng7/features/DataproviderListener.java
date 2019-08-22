package testng7.features;

import org.testng.IDataProviderMethod;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DataproviderListener implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getDataProviderMethod().getName();
		//IDataProviderMethod dataProviderMethod = result.getMethod().getDataProviderMethod();
		System.out.println(name);
	}
	
}
