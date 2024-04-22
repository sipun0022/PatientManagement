package com.cerner.model;

import java.util.Date;

public class Patient {

	private int pId;
	private String pname;
	private String gender;
	private Date dob;
	private String address;
	private boolean active_id;

	public Patient() {
		super();
	}

	public Patient(int pId, String pname, String gender, Date dob, String address, boolean active_id) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.active_id = active_id;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive_id() {
		return active_id;
	}

	public void setActive_id(boolean active_id) {
		this.active_id = active_id;
	}

	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pname=" + pname + ", gender=" + gender + ", dob=" + dob + ", address="
				+ address + ", active_id=" + active_id + "]";
	}

	

}
