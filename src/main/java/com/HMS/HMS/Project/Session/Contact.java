package com.HMS.HMS.Project.Session;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {

	
	String name;
	String address;
	
	String mobile;
	String services;
	String symptoms;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

 
	public String getServices() {
		return services;
	}


	public String getSymptoms() {
		return symptoms;
	}


	public void setServices(String services) {
		this.services = services;
	}


	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public Contact(String name, String address, String mobile, String services, String symptoms) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.services = services;
		this.symptoms = symptoms;
	}


	@Override
	public String toString() {
		return "Contact [name=" + name + ", address=" + address + ", mobile=" + mobile + ", services=" + services
				+ ", symptoms=" + symptoms + "]";
	}


	@Id
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	 

}
