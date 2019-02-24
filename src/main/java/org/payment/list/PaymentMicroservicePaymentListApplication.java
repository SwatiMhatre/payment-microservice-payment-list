package org.payment.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.payment.list.controller")
public class PaymentMicroservicePaymentListApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMicroservicePaymentListApplication.class, args);
	}

}

