package fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	FileInputStream path;
	Workbook wb;

	public Object[][] readMultipleData(String sheetname) {

		try {
			path = new FileInputStream("./Data/book2.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
		try {
			wb = WorkbookFactory.create(path);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetname);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowcount][cellcount];

		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				// String data= sheet.getRow(i).getCell(j).getStringCellValue(); no need
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;

	}

	public String fetchSingleData(String sheetName, int rowNumber, int cellNumber) {

		try {
			path = new FileInputStream("./Data/shooperstackadd.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			wb = WorkbookFactory.create(path);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return data;

	}
}
/*
 * public class ReadExcel { FileInputStream path; Workbook wb; public Object[][]
 * readMultipleData(String sheetName) { try { path=new
 * FileInputStream("./src/test/resources/login.swag.xlsx"); } catch
 * (FileNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } try { wb=WorkbookFactory.create(path); } catch
 * (EncryptedDocumentException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); } Sheet sheet=wb.getSheet(sheetName); int
 * rowCount=sheet.getPhysicalNumberOfRows(); int
 * cellCount=sheet.getRow(0).getPhysicalNumberOfCells(); Object[][] data=new
 * Object[rowCount][cellCount];
 * 
 * for(int i=0;i<rowCount;i++) {
 * 
 * for(int j=0;j<cellCount;j++) {
 * 
 * data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
 * System.out.println(data); } } return data; }
 * 
 */
