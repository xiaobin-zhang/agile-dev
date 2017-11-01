package com.agile.demo.demo3.service;

import java.math.BigDecimal;

import com.agile.demo.demo3.domain.DepositAcct;

/**
 * 存款服务
 * @author zhangxiaobin
 *
 */
public interface IDepositAcctService {
	
	/**
	 * 获取存款账户余额
	 * @param depositAcct
	 * @return
	 */
	BigDecimal getCurrBal(DepositAcct depositAcct);
	
}
