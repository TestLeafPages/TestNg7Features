package testng7.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	@Test(dataProvider = "getData", dataProviderClass = DataSupplier.class)
	public void login(String userName, String passWord) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver76.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(passWord);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();

	}

	/*
	 * @DataProvider public Object[][] getData() { Object[][] data=new Object[2][2];
	 * data[0][0]="demosalesmanager"; data[0][1]="crmsfa";
	 * 
	 * data[1][0]="democsr"; data[1][1]="crmsfa";
	 * 
	 * return data;
	 * 
	 * }
	 */

}
