package com.flc.entities;

import java.util.Objects;

public class Product {
	private int productNo;
	private String productNm;
	private String description;
	private String manufacturerNm;
	private String category;
	private double price;
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturerNm() {
		return manufacturerNm;
	}
	public void setManufacturerNm(String manufacturerNm) {
		this.manufacturerNm = manufacturerNm;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, description, manufacturerNm, price, productNm, productNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(manufacturerNm, other.manufacturerNm)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productNm, other.productNm) && productNo == other.productNo;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productNm=" + productNm + ", description=" + description
				+ ", manufacturerNm=" + manufacturerNm + ", category=" + category + ", price=" + price + "]";
	}
}
