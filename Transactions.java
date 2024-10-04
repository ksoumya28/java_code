package codePrep.interviewQ1;

import java.util.Date;

public class Transactions {
	
	String txnDate;
	String customerName;
	String txnStatus;
	String bankName;
	Double amount;
	public String getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTxnStatus() {
		return txnStatus;
	}
	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	public Transactions() {
		super();
	}
	public Transactions(String txnDate, String customerName, String txnStatus, String bankName, Double amount) {
		super();
		this.txnDate = txnDate;
		this.customerName = customerName;
		this.txnStatus = txnStatus;
		this.bankName = bankName;
		this.amount = amount;
	}
	
	
	
	

}
