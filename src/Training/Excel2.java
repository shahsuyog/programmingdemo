package Training;



	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Excel2 {

		public static Workbook wb;
		public static Sheet sh;

		public Excel2() throws IOException {

			FileInputStream fp = new FileInputStream("F:\\java\\Testdata.xlsx");
			wb = new XSSFWorkbook(fp);
			sh = wb.getSheet("Sheet1");
			System.out.println(sh.getLastRowNum());
		}

		public static void main(String[] args) throws IOException {

			Excel2 e = new Excel2();

		

	}

}
