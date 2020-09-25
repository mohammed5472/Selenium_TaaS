package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider="testData")
	public void test1(String username, String password) {
		System.out.println(username+" | "+password);
		
			
		}
	

	
	@DataProvider(name = "test1Data")
	public  Object[][] getData() {
		
		String projectPath = System.getProperty("user.dir");	
		Object data[][] = testData(projectPath+"/excel/data.xlsx", "Sheet1");
		return data;
	}
	
	
	public static Object[][] testData(String excelPath, String sheetName) {
		
		excelUtils excel = new excelUtils(excelPath, sheetName);
		
		int colCount = excel.getRowCount();
		int rowCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for (int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String celldata = excel.getCellDataString(i, j);
				//System.out.println(celldata+" | ");
				data[i-1][j] = celldata;
			}
			System.out.println();
			
			
		}
		return data;
	}

}
