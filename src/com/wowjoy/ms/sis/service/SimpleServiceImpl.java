package com.wowjoy.ms.sis.service;

import com.wowjoy.ms.sis.service.handler.GzAccountHandler;
import com.wowjoy.ms.sis.service.strategy.AccountContext;
import com.wowjoy.ms.sis.service.strategy.GzAccountStrategy;

public class SimpleServiceImpl {
	
	public void service(String mediInsureId, String tradeNo) {
		AccountContext<String, Integer> context = new AccountContext<>(new GzAccountStrategy());
		Integer result = context.execute(new GzAccountHandler(), "helloworld");
		System.out.println(result);
	}
	
}
