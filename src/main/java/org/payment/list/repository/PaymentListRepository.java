package org.payment.list.repository;

import java.util.List;

import org.payment.list.dto.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface PaymentListRepository extends JpaRepository<PaymentDetails, Integer> {
	/*@Query("SELECT id,debitAccount,creditAccount,amount,reason,executionDate "
	        + "FROM payment_list" )
	List<PaymentDetails> getPaymentList();*/
}
