package com.wowjoy.ms.sis.service.strategy;

import com.wowjoy.ms.sis.service.param.BusinessParam;

public class AccountContext {
	
	private AccountStrategy accountStrategy;
	
	public BusinessParam execute(BusinessParam businessParam) {
		return accountStrategy.execute(businessParam);
	}
	
	public AccountContext(AccountStrategy accountStrategy) {
		this.accountStrategy = accountStrategy;
	}
	
}
