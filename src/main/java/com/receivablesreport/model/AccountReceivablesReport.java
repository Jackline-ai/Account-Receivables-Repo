package com.receivablesreport.model;

import java.util.List;

public class AccountReceivablesReport {
	private Long id;
	private String tradeName;
	private String address;
	private String city;
	private String date;
	private String clientInfo;
	private String name;
	private String clientAddress;
	private String email;
	private String tel;
	private String receivablesInfo;
	private List<AccountReceivablesItems>items;
	private double totalReceivables;
	private double totalAmountReceived;
	private double totalBadDebts;
	private double netReceivables;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<AccountReceivablesItems> getItems() {
		return items;
	}
	public void setItems(List<AccountReceivablesItems> items) {
		this.items = items;
	}
	public double getTotalReceivables() {
		return totalReceivables;
	}
	public void setTotalReceivables(double totalReceivables) {
		this.totalReceivables = totalReceivables;
	}
	public double getTotalBadDebts() {
		return totalBadDebts;
	}
	public void setTotalBadDebts(double totalBadDebts) {
		this.totalBadDebts = totalBadDebts;
	}
	public double getNetReceivables() {
		return netReceivables;
	}
	public void setNetReceivables(double netReceivables) {
		this.netReceivables = netReceivables;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public double getTotalAmountReceived() {
		return totalAmountReceived;
	}
	public void setTotalAmountReceived(double totalAmountReceived) {
		this.totalAmountReceived = totalAmountReceived;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getClientInfo() {
		return clientInfo;
	}
	public void setClientInfo(String clientInfo) {
		this.clientInfo = clientInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClientAddress() {
		return clientAddress;
	}
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getReceivablesInfo() {
		return receivablesInfo;
	}
	public void setReceivablesInfo(String receivablesInfo) {
		this.receivablesInfo = receivablesInfo;
	}
	
	

}
