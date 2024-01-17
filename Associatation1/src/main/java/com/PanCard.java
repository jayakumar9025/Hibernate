package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	private int panno;
	private String address;
	private String dob;

	public int getPanno() {
		return panno;
	}

	public void setPanno(int panno) {
		this.panno = panno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "PanCard [panno=" + panno + ", address=" + address + ", dob=" + dob + "]";
	}

}
