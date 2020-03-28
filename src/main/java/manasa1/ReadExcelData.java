package manasa1;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelDataConfig excel=new ExcelDataConfig("C:\\\\Users\\\\pc\\\\eclipse-workspace\\\\cts-selenium-project\\\\src\\\\test\\\\resources\\\\XLS\\\\TextData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));
	}
}
