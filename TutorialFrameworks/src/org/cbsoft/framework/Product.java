package org.cbsoft.framework;

import org.aula.application.Uppercase;

public class Product{
	
	private String name;
	private String brand;
	private double price;
	private String code;
	private String secretCode;
	
	public Product(String name, String brand, double price, String code) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	@Prefix("NR#")
	public String getCode() {
		return code;
	}
	
	@Uppercase
	public String getName() {
		return name;
	}
	@Prefix("R$")
	public double getPrice() {
		return price;
	}
	
	@DontIncludeOnFile
	public String getSecretCode() {
		return secretCode;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}
	

}
