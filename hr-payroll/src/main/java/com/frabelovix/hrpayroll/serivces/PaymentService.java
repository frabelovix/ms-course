package com.frabelovix.hrpayroll.serivces;

import org.springframework.stereotype.Service;

import com.frabelovix.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Mock", 200.0, 10);
	}

}
