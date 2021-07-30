package com.frabelovix.hrpayroll.serivces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frabelovix.hrpayroll.entities.Payment;
import com.frabelovix.hrpayroll.entities.Worker;
import com.frabelovix.hrpayroll.feignClients.WorkerFeignClient;

@Service
public class PaymentService {	

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
		
	}

}
