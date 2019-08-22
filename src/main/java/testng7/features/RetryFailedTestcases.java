package testng7.features;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryFailedTestcases implements IRetryAnalyzer,IAnnotationTransformer {
	int count=0;
	public boolean retry(ITestResult result) {
		
		if(count<=2 && result.getStatus()==2) {
			
			count++;
			System.out.println(result.getName()+" -- execution count "+count);
			return true;
		}

		return false;
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(this.getClass());
		
	}

}
