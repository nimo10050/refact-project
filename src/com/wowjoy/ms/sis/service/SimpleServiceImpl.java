package com.wowjoy.ms.sis.service;

import com.wowjoy.ms.sis.service.config.AccountConfig;
import com.wowjoy.ms.sis.service.handler.AccountHandler;
import com.wowjoy.ms.sis.service.strategy.XxChooseStrategy;

public class SimpleServiceImpl {
	
	public void service(String mediInsureId, String tradeNo) {
		AccountConfig config = new AccountConfig();
		AccountHandler<String, Void> handler = new XxChooseStrategy().getAccountHandler(config);
		Void result = handler.handle("hello world", config);
	}
	
}
