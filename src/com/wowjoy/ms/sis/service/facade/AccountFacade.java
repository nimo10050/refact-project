package com.wowjoy.ms.sis.service.facade;

import com.wowjoy.ms.sis.service.config.AccountConfig;
import com.wowjoy.ms.sis.service.strategy.AccountContext;
import com.wowjoy.ms.sis.service.strategy.AccountStrategy;
import com.wowjoy.ms.sis.service.strategy.AccountStrategyEnum;

public class AccountFacade {

	public static AccountContext getAccountContext(AccountConfig config) {
		AccountStrategy strategy = AccountStrategyEnum.getAccountStrategy(config.getMediInsureId());
		AccountContext context = new AccountContext(strategy);
		return context;
	}
	
}
