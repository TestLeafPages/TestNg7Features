package testng7.features;

import java.util.List;

import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class SkipCausedListener implements ITestListener {
	
	//Not required to add all the unimplemented methods.
	//just implement only your customization
	
	public void onTestSkipped(ITestResult result) {
		List<ITestNGMethod> skipCausedBy = result.getSkipCausedBy();
		System.out.println(skipCausedBy);
		
	}

}
