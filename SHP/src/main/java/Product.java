package main.java;

import java.sql.Date;

public class Product {
	private int productId;
	private String productCode;
	private String productDesc;
	private double productPrice;
	private int productQty;
	private Date productExpDate;

	// Constructors
//    public Product() {}
	public Product(String productCode, String productDesc, double productPrice, int productQty, Date productExpDate) {
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productQty = productQty;
		this.productExpDate = productExpDate;
	}

	// Getters & Setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public Date getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(Date productExpDate) {
		this.productExpDate = productExpDate;
	}

	@Override
	public String toString() {
		return "Product [ID=" + productId + ", Code=" + productCode + ", Desc=" + productDesc + ", Price="
				+ productPrice + ", Qty=" + productQty + ", ExpDate=" + productExpDate + "]";
	}
}
