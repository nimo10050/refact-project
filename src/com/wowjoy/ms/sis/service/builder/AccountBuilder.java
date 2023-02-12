package com.wowjoy.ms.sis.service.builder;


import com.wowjoy.ms.sis.service.component.AccountComponent;
import com.wowjoy.ms.sis.service.component.GzAccountMenu;
import com.wowjoy.ms.sis.service.component.GzTotalAccountComponent;
import com.wowjoy.ms.sis.service.component.IAccountMenu;
import com.wowjoy.ms.sis.service.config.AccountConfig;
import com.wowjoy.ms.sis.service.constant.AccountConstants;

public class AccountBuilder {
	
	public IAccountMenu gz() {
		return new GzAccountMenu().addTotalAccountComponent(new GzTotalAccountComponent());
	}

	public AccountComponent<?, ?> build(AccountConfig config) {
		if(config.getTradeNo() == AccountConstants.TRADE_NO_3101) {
			return new GzTotalAccountComponent();
		}
		return null;
	}
	
	
	
}
