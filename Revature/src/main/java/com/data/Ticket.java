package com.data;

public class Ticket {
	
	int type;
	double amount;
	String description;



	public Ticket() {
	}

	public Ticket(int type, double amount, String description) {
		this.type = type;
		this.amount = amount;
		this.description = description;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Ticket [type=" + type + ", amount=" + amount + ", description=" + description + "]";
	}

	public int getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}
}
