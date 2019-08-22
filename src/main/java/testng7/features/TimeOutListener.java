package testng7.features;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TimeOutListener implements ITestListener {
	
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
	}

	
}
