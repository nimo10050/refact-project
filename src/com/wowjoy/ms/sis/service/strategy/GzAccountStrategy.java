package com.wowjoy.ms.sis.service.strategy;

import com.wowjoy.ms.sis.service.builder.AccountBuilder;
import com.wowjoy.ms.sis.service.component.AccountComponent;
import com.wowjoy.ms.sis.service.config.AccountConfig;
import com.wowjoy.ms.sis.service.param.BusinessParam;

public class GzAccountStrategy implements AccountStrategy {

	
	@Override
	public BusinessParam execute(BusinessParam businessParam) {
		AccountBuilder builder = new AccountBuilder();
		AccountComponent component = builder.build(new AccountConfig("", ""));
		return component.execute(businessParam);
	}
	
}
