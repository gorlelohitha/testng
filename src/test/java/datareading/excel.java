package datareading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class excel {
	public static void main(String[] args) throws IOException {
		String excelFilePath = System.getProperty("user.dir") + "\\files\\emp.xlsx";
		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();
		int colums = sheet.getRow(0).getLastCellNum();
		for (int r = 0; r < rows; r++) {
			XSSFRow row = sheet.getRow(rows);
			if (row == null) {
				continue; // Skip if
			}

				for (int c = 0; c < colums; c++) {
					XSSFCell cell = row.getCell(c);
					if (cell == null) {
						continue; // Skip if the cell is null
					}

					org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
					switch (cellType) {

					case STRING:
						System.out.println(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.println(cell.getNumericCellValue());
						break;

					}

				}

			
		}
	}
}
