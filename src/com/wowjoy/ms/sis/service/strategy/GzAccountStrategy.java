package com.wowjoy.ms.sis.service.strategy;

import com.wowjoy.ms.sis.service.builder.AccountBuilder;
import com.wowjoy.ms.sis.service.component.AccountComponent;

public class GzAccountStrategy implements AccountStrategy<String, Integer> {

	
	@Override
	public Integer execute(String t) {
		AccountBuilder builder = new AccountBuilder();
		AccountComponent<String, Integer> component = builder.build(null);
		return component.execute(t);
	}
	
}
