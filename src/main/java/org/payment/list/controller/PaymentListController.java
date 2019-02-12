package org.payment.list.controller;

import java.util.List;

import org.payment.list.dto.PaymentDetails;
import org.payment.list.repository.PaymentListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@RequestMapping(value="/payment-list")
public class PaymentListController {
	@Autowired
	PaymentListRepository repository;
	
	@CrossOrigin
	@GetMapping(value="/list", produces="application/json")
	public List<PaymentDetails> getData(){

		return repository.findAll();
	}
	
	@CrossOrigin
	@GetMapping(value="/save")
	public String saveData(){
		PaymentDetails details = new PaymentDetails();
		details.setId(12L);
		details.setAmount((long) 20.21);
		details.setCurrency("INR");
		details.setCreditAccount("test123");
		details.setDebitAccount("test123");
		details.setExecutionDate("16-07-1988");
		details.setReason("test123");
		
		repository.save(details);
		
		return "data saved!!";
	}

}
