package com.HibernateExample;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jakarta.persistence.Transient;
@Entity
@Table(name = "student_details")
public class Address1 {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	
	private String street;
	private String city;
	
	private boolean isOpen;
	
	@Transient
	private double x;
	private Date addedDate;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(java.util.Date date) {
		this.addedDate = addedDate;
	}
	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address1(int addressId, String street, String city, boolean isOpen, double x, Date addedDate) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
	}
	
	
	
	}
