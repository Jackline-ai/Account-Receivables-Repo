package com.receivablesreport.model;

public class AccountReceivablesItems {
	private Long id;
	private  String invoiceDate;
	private String invoiceNo;
	private String debtorName;
	private double invoiceAmount;
	private double creditPeriod;
	private String dueDate;
	private String paymentDate;
	private double amountReceived;
	private double balance;
	private double badDebts;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getdebtorName() {
		return debtorName;
	}
	public void setdebtorName(String debtorName) {
		this.debtorName = debtorName;
	}
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public double getCreditPeriod() {
		return creditPeriod;
	}
	public void setCreditPeriod(double creditPeriod) {
		this.creditPeriod = creditPeriod;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(double amountReceived) {
		this.amountReceived = amountReceived;
	}
	public double getBadDebts() {
		return badDebts;
	}
	public void setRemarks(double badDebts) {
		this.badDebts = badDebts;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
