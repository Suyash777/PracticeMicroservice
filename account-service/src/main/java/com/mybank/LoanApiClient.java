package com.mybank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "loan-service")
public interface LoanApiClient {
	
	@GetMapping("/api/loan/{accountNumber}")
	public LoanResponseDto getLoan(@PathVariable long accountNumber);
}
