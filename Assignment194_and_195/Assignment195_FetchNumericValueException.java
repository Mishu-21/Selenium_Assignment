package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment195_FetchNumericValueException {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		
		String username=w1.getSheet("amazon_credentails").getRow(2).getCell(0).getStringCellValue();

		System.out.println(username);
		
	}	
}

/*
 OUTPUT------------------>"IllegalStateException"
 
 Exception in thread "main" java.lang.IllegalStateException: Cannot get a STRING value from a NUMERIC cell
	at org.apache.poi.xssf.usermodel.XSSFCell.typeMismatch(XSSFCell.java:987)
	at org.apache.poi.xssf.usermodel.XSSFCell.getRichStringCellValue(XSSFCell.java:336)
	at org.apache.poi.xssf.usermodel.XSSFCell.getStringCellValue(XSSFCell.java:280)
	at DataDrivenTesting.Assignment195_FetchNumericValueException.main(Assignment195_FetchNumericValueException.java:16)

 */
