package com.ymeng.springdemo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args){

		Test one = new Test();
		one.setRecord("1");
		
		List<Test> list = new ArrayList<Test>();
		list.add(one);

		one.setRecord("2");

		Test firstObj = (Test)list.get(0);
		System.out.println(firstObj.getRecord());
	}
	
		
	private String 	szRecord 			= "";
	private String 	szPan 				= "";
	private String 	szExpiryDate 		= "";
	
	public String getRecord() {
		return szRecord;
	}
	public void setRecord(String szRecord) {
		this.szRecord = szRecord;
	}
	
	public String getPan() {
		return szPan;
	}
	public void setPan(String szPan) {
		this.szPan = szPan;
	}
	public String getExpiryDate() {
		return szExpiryDate;
	}
	public void setExpiryDate(String szExpiryDate) {
		this.szExpiryDate = szExpiryDate;
	}
		
}
