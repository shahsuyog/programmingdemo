package Training;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	
	public static Workbook wb;
	public static Sheet sh;
	public static Row rw;
	
	public ExcelSheet() throws IOException {
//		FileInputStream fp= new FileInputStream("F:\\java\\Testdata.xlsx");
//		wb = new XSSFWorkbook(fp);
//		
//		sh = wb.getSheet("Sheet1");
//	
//		System.out.println(	sh.getLastRowNum());
		
		FileInputStream fp= new FileInputStream(new File("F:\\java\\Testdata.xlsx"));
		wb = new XSSFWorkbook(fp);
		
	sh = wb.getSheet("Sheet1");
	
	System.out.println(	sh.getLastRowNum());

		
	}
	
public void getAllRowAndColumn() {
	rw=sh.getRow(0);
	int totrow=sh.getLastRowNum();
	System.out.println(totrow);
	
	int totcell=rw.getLastCellNum();
	System.out.println(totcell);
}
	public static void main(String[] args) throws IOException {
		System.out.println("hi");
		ExcelSheet t=new ExcelSheet();
	//	t.getAllRowAndColumn();
		
		
		
	}

}

