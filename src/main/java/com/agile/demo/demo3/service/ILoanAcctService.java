package com.agile.demo.demo3.service;

import java.math.BigDecimal;

import com.agile.demo.demo3.domain.LoanAcct;

/**
 * 贷款服务
 * @author zhangxiaobin
 *
 */
public interface ILoanAcctService {

	/**
	 * 获取贷款账户余额
	 * @param loanAcct
	 * @return
	 */
	BigDecimal getCurrBal(LoanAcct loanAcct);
}
