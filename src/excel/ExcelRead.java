package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static FileInputStream fp;
	public static Workbook wb;
	public static Sheet sh;
	public static Row rw;
	
	public ExcelRead() throws IOException {
	
		fp =new FileInputStream("E:\\\\My desktop\\\\eclipse-workspace\\\\programming\\\\src\\\\excel\\\\testdata.xlsx");
		wb= new XSSFWorkbook(fp);
		sh=wb.getSheet("Sheet1");
		System.out.println(sh.getSheetName());
	}
	
	public Object[][] readdata()  {
		System.out.println("inside read data");
		
		rw=sh.getRow(0);
		int totrow=sh.getLastRowNum();
		int totcell=rw.getLastCellNum();
		Object [][] obj=new Object [totrow][totcell] ;
		for (int i = 1; i <= totrow; i++){
			for(int j = 0; j < totcell; i++) {
				
				obj [i-1][j] =sh.getRow(i).getCell(i).toString();
				System.out.println(obj [i-1][j].toString());  // for array data checking
			}
		} 
		return obj;
		
		
	}
}
