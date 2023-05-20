package com.onetomanyset.entities;

import java.io.Serializable;
import java.util.Date;

public class TrafficChallan implements Serializable {
	protected int challanNo;
	protected String description;
	protected Date issuedDate;
	protected String violationType;
	protected double amount;

	public int getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(int challanNo) {
		this.challanNo = challanNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getViolationType() {
		return violationType;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + challanNo;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((issuedDate == null) ? 0 : issuedDate.hashCode());
		result = prime * result + ((violationType == null) ? 0 : violationType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrafficChallan other = (TrafficChallan) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (challanNo != other.challanNo)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (issuedDate == null) {
			if (other.issuedDate != null)
				return false;
		} else if (!issuedDate.equals(other.issuedDate))
			return false;
		if (violationType == null) {
			if (other.violationType != null)
				return false;
		} else if (!violationType.equals(other.violationType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrafficChallan [challanNo=" + challanNo + ", description=" + description + ", issuedDate=" + issuedDate
				+ ", violationType=" + violationType + ", amount=" + amount + "]";
	}

}
