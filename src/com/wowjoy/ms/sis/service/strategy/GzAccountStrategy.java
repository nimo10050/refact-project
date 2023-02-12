package com.wowjoy.ms.sis.service.strategy;

import com.wowjoy.ms.sis.service.builder.AccountBuilder;
import com.wowjoy.ms.sis.service.component.AccountComponent;
import com.wowjoy.ms.sis.service.handler.AccountHandler;

public class GzAccountStrategy implements AccountStrategy<String, Integer> {

	
	@Override
	public Integer execute(AccountHandler<String, Integer> handler, String t) {
		AccountBuilder builder = new AccountBuilder();
		AccountComponent<?, ?> component = builder.build(null);
		return  component.execute(t);
	}
	
}
