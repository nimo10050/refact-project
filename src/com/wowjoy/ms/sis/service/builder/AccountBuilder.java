package com.wowjoy.ms.sis.service.builder;

import java.util.ArrayList;
import java.util.List;

import com.wowjoy.ms.sis.service.component.AccountComponent;
import com.wowjoy.ms.sis.service.component.GzAccountMenu;
import com.wowjoy.ms.sis.service.component.GzTotalAccountComponent;
import com.wowjoy.ms.sis.service.component.IAccountMenu;
import com.wowjoy.ms.sis.service.config.AccountConfig;

public class AccountBuilder {
	
	public IAccountMenu gz() {
		return new GzAccountMenu().addTotalAccountComponent(new GzTotalAccountComponent());
	}
	
	List<AccountComponent> accountComponentList = new ArrayList<>();

	public AccountComponent build(AccountConfig config) {
		
		return null;
	}
	
	
	
}
