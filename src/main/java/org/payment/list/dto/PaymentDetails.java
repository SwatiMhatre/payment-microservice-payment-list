package org.payment.list.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="payment_list")
public class PaymentDetails {
	@Id
	private Long id;

	@Column(name = "debit_account")
	private String debitAccount;
	
	@Column(name = "credit_account")
	private String creditAccount;
	
	@Column(name = "execution_date")
	private String executionDate;
	
	@Column(name = "amount")
	private Long amount;

	@Column(name = "reason")
	private String reason;
	
	@Column(name = "currency")
	private String currency;

	public PaymentDetails() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDebitAccount() {
		return debitAccount;
	}

	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}

	public String getCreditAccount() {
		return creditAccount;
	}

	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}

	public String getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "PaymentDetails [id=" + id + ", debitAccount=" + debitAccount + ", creditAccount=" + creditAccount
				+ ", executionDate=" + executionDate + ", amount=" + amount + ", reason=" + reason + ", currency="
				+ currency + "]";
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
