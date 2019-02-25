package org.payment.list.dto;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="payment_list")
public class PaymentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "debit_account")
	private String debitAccount;
	
	@Column(name = "credit_account")
	private String creditAccount;
	
	@Embedded
	//@Column(name = "execution_date")
	private ExecutionDate executionDate;
	
	@Column(name = "amount")
	private Long amount;

	@Column(name = "reason")
	private String reason;
	
	@Column(name = "currency")
	private String currency;

	public PaymentDetails() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public ExecutionDate getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(ExecutionDate executionDate) {
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
