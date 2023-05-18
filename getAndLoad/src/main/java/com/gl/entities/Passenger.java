package com.gl.entities;

import java.io.Serializable;
import java.util.Objects;

final public class Passenger implements Serializable,IPassenger{
	private int passengerNo;
	private String passengerName;
	private int age;
	private String gender;
	
	@Override
	public int getPassengerNo() {
		// TODO Auto-generated method stub
		return passengerNo;
	}
	@Override
	public void setPassengerNo(int passengerNo) {
		// TODO Auto-generated method stub
		this.passengerNo=passengerNo;
	}
	@Override
	public String getPassengerName() {
		// TODO Auto-generated method stub
		return passengerName;
	}
	@Override
	public void setPassengerName(String passengerName) {
		// TODO Auto-generated method stub
		this.passengerName=passengerName;
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}
	@Override
	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}
	@Override
	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender=gender;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, passengerName, passengerNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return age == other.age && Objects.equals(gender, other.gender)
				&& Objects.equals(passengerName, other.passengerName) && passengerNo == other.passengerNo;
	}
	@Override
	public String toString() {
		return "Passenger [passengerNo=" + passengerNo + ", passengerName=" + passengerName + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
}
