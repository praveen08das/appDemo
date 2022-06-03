package com.entity;

import java.util.ArrayList;
import java.util.List;
public class Student {
	
	
	private int id;
	private String nameStudent;
	private String addressStudent;
	
     @Override
	public String toString() {
		return "Student [id=" + id + ", nameStudent=" + nameStudent + ", addressStudent=" + addressStudent + ", sub="
				+ sub + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameStudent() {
		return nameStudent;
	}


	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}


	public String getAddressStudent() {
		return addressStudent;
	}


	public void setAddressStudent(String addressStudent) {
		this.addressStudent = addressStudent;
	}


	public List<String> getSub() {
		return sub;
	}


	public void setSub(List<String> sub) {
		this.sub = sub;
	}


	List<String>  sub =    new ArrayList();
     

}
