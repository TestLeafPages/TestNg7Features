package testng7.features;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	
	@DataProvider
	public static String[][] getData() {
		String[][] data=new String[2][2];
		data[0][0]="demosalesmanager";
		data[0][1]="crmsfa";
		
		data[1][0]="democsr";
		data[1][1]="crmsfa";
		
		return data;

	}

}
