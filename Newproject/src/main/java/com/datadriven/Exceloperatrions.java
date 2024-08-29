package com.datadriven;

public class Exceloperatrions {
	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\laksh\\eclipse-workspace\\Newproject\\src\\main\\java\\com\\testdata\\testdata.xlsx");
		
		//reader.addSheet("lakshmi");
		if(!reader.isSheetExist("RegData"))
		{
		reader.addSheet("naresh");
		}
		
		reader.removeColumn("RegData", 2);
		
}
}