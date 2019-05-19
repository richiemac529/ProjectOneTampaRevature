package com.example.model;

public class Pet {
	public double userid;
	public String fname, lname, name, pass;
	
	public Pet() {
	}

	


	public Pet(  String name,double userid, String pass) {
		super();
		this.userid = userid;
		this.name = name;
		this.pass = pass;
	}




	public double getUserid() {
		return userid;
	}

	public void setUserid(double userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getpass() {
		return pass;
	}

	public void setpass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Pet [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", name=" + name
				+ ", pass=" + pass + "]";
	}

	

}
