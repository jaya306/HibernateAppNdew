package com.csi.jpa;


public class Customer {

	private int custId;

	private String custName;

	private long custContactNumber;

	private double accountBalance;

	public Customer(String custName, long custContactNumber, double accountBalance) {
		super();
		this.custName = custName;
		this.custContactNumber = custContactNumber;
		this.accountBalance = accountBalance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

}
