package com.cybertek;

public class WorkingWithExcel {

	public static void main(String[] args) {
		
		String path="/Users/edilmasimov/Desktop/SELENIUM/TESTINGDATA/TESTDATA.xlsx";
   
		Xls_Reader data=new Xls_Reader(path);
		
		int rcount=data.getRowCount("data2");
		System.out.println(rcount);
		
		String cdata=data.getCellData("data2","Name",2);
		System.out.println(cdata);
		
		int ccount =data.getColumnCount ("data2");
		System.out.println(ccount);
		
		data.setCellData("data2","Name",8,"Ozzy");

	}

}
