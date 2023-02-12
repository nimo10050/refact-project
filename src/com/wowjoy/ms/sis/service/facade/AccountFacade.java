package com.wowjoy.ms.sis.service.facade;

import com.wowjoy.ms.sis.service.config.AccountConfig;
import com.wowjoy.ms.sis.service.strategy.AccountContext;
import com.wowjoy.ms.sis.service.strategy.GzAccountStrategy;

public class AccountFacade {

	public static AccountContext getAccountContext(AccountConfig config) {
		AccountContext context = new AccountContext(new GzAccountStrategy());
		return context;
	}
	
}
