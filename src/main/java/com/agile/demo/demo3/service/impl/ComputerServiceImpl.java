package com.agile.demo.demo3.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.agile.demo.demo3.domain.Acct;
import com.agile.demo.demo3.domain.DepositAcct;
import com.agile.demo.demo3.domain.LoanAcct;
import com.agile.demo.demo3.service.IComputeService;
import com.agile.demo.demo3.service.IDepositAcctService;
import com.agile.demo.demo3.service.ILoanAcctService;

public class ComputerServiceImpl implements IComputeService {

	@Autowired
	private IDepositAcctService depositAcctService;
	
	@Autowired
	private ILoanAcctService loanAcctService;
	
	@Override
	public BigDecimal getCurrBal(Acct acct) {
		BigDecimal currBal = BigDecimal.ZERO;
		if (acct instanceof DepositAcct) {
			depositAcctService.getCurrBal((DepositAcct) acct);
		} else {
			loanAcctService.getCurrBal((LoanAcct) acct);
		}
		return currBal;
	}

	@Override
	public LocalDate calcuInterestDay(Acct acct) {
		LocalDate interestDay;
		if (acct instanceof LoanAcct) {
			interestDay = ((LoanAcct) acct).getInterestDay().plusMonths(1);
		} else {
			interestDay = ((DepositAcct) acct).getInterestDay().plusMonths(1);
		}
		if (interestDay == null) {
			throw new IllegalArgumentException("some error");
		}
		return interestDay;
	}
	
	public LocalDate calcuDepositInterestDay(DepositAcct acct) {
		LocalDate interestDay = acct.getInterestDay().plusMonths(1);
		return interestDay;
	}
	
	public LocalDate calcuLoanInterestDay(LoanAcct acct) {
		LocalDate interestDay = acct.getInterestDay().plusMonths(1);
		return interestDay;
	}

}
