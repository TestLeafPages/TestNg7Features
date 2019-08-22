package testng7.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test(dataProvider="getData",dataProviderClass=DataSupplier.class)
public class DataProviderAtClass {

	public void login(String userName,String passWord) {
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
	
	
	public void data(String userName,String passWord) {
		System.out.println(userName);
		System.out.println(passWord);
	}
	

}
