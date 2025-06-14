package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testDataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
       int totalCells = sheet.getRow(1).getLastCellNum();
       System.out.println("Number of Rows:"+totalRows);
       System.out.println("Number of Cells:"+totalCells);
       
       for(int r=0; r<=totalRows; r++)
       {
    	  XSSFRow currentRow = sheet.getRow(r);
    	   
    	   for(int c=0; c<totalCells; c++)
    	   {
    		   XSSFCell cell = currentRow.getCell(c);
    		   System.out.print(cell.toString()+"\t");
    	   }
           System.out.println();
       }
	}

}
