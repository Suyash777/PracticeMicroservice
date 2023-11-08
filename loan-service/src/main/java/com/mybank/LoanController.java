package com.mybank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loan")
public class LoanController {

	@Autowired
	private LoanRepository loanRepo;
	
	
	@GetMapping("/{accountNumber}")
	public LoanResponseDto getLoan(@PathVariable long accountNumber) {
		Loan loan = loanRepo.findByAccountNumber(accountNumber).get();
		LoanResponseDto loanResponseDto = new LoanResponseDto();
		loanResponseDto.setLoan(loan);
		return loanResponseDto;
	}
}
