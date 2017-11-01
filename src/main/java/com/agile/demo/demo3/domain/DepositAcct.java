package com.agile.demo.demo3.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 存款账户.
 * @author zhangxiaobin
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class DepositAcct extends Acct {

	/**
	 * 账户编号.
	 */
	private BigDecimal acctSeq;
	
	/**
	 * 余额.
	 */
	private BigDecimal currBal;
	
	/**
	 * 结息日.
	 */
	private LocalDate interestDay;
}
