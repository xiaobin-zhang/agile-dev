package com.agile.demo.demo3.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.agile.demo.demo3.domain.Acct;

/**
 * 计算服务
 * @author zhangxiaobin
 *
 */
public interface IComputeService {

	/**
	 * 获取账户余额
	 * @param acct
	 * @return
	 */
	BigDecimal getCurrBal(Acct acct);
	
	LocalDate calcuInterestDay(Acct acct);
}
