package com.mybank;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long accountNumber;
	private long loanNumber;
	private double loanAmount;
	private LocalDateTime dateCreated;
	public Loan() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
}
