package com.tnsif.day2;

public class EncapsulationDemo {
	private int SerialNumber;
	private float Price;
	private String Name;
	public int getSerialNumber()
	{
		return SerialNumber;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setSerialNumber(int serialNumber) {
		SerialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "EncapsulationDemo [getSerialNumber()=" + getSerialNumber() + ", getPrice()=" + getPrice()
				+ ", getName()=" + getName() + "]";
	}
	
	
	
}
