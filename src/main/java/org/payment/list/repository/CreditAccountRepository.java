package org.payment.list.repository;

import java.util.List;

import org.payment.list.dto.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CreditAccountRepository extends JpaRepository<PaymentDetails, Integer> {
	List<PaymentDetails> getPaymentList();
}
