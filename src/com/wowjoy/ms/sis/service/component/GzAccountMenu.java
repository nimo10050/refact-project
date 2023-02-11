package com.wowjoy.ms.sis.service.component;

import java.util.ArrayList;
import java.util.List;

public class GzAccountMenu implements IAccountMenu {

	private List<AccountComponent> accountComponentList = new ArrayList<>();
	
	@Override
	public IAccountMenu addTotalAccountComponent(AccountComponent accountComponent) {
		accountComponentList.add(accountComponent);
		return this;
	}

}
