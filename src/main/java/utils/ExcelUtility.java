package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtility {

	
	public static String[][] excelfilereading(String FileName) throws IOException {
		
		// Read the file
				FileInputStream fis = new FileInputStream(new File("./data/"+FileName+".xlsx"));
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				
				// go to first sheet
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				// get all rows
				int rowNumber = sheet.getLastRowNum();
				int colNumber = sheet.getRow(1).getLastCellNum();
				System.out.println(rowNumber);
				System.out.println(colNumber);
		
				
				String values[][] = new String[rowNumber][colNumber];
				for(int i =1; i<rowNumber;i++) {
					
					for(int j =0; j<colNumber;j++) {
					
						String txt = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println(txt);
						values[i-1][j]=txt;
				}
				
			
	}
				workbook.close();
				return values;
	}
}

	
	
	
	