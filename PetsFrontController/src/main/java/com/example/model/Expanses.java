package com.example.model;

public class Expanses {
	public double Amount;
	public String type, Description;
	
	
	
	
	public Expanses( String type,double amount, String description) {
		super();
		
		this.type = type;
		Amount = amount;
		Description = description;
	}
	public Expanses() {
		super();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		this.Amount = amount;
	}

	@Override
	public String toString() {
		return "Expanses [amount=" + Amount + ", Extype=" + type + ", comments=" + Description + "]";
	}

}
