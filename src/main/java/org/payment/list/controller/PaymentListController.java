package org.payment.list.controller;

import java.util.List;

import org.payment.list.dto.PaymentDetails;
import org.payment.list.repository.PaymentListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping(value="/save")
	public String saveData(@RequestBody PaymentDetails details){
		System.out.println("person details::::"+details);
		repository.save(details);
		
		return "data saved!!";
	}
	
}
