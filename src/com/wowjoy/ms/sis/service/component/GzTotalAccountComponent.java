package com.wowjoy.ms.sis.service.component;

import com.wowjoy.ms.sis.service.handler.AccountHandler;
import com.wowjoy.ms.sis.service.handler.GzAccountHandler;
import com.wowjoy.ms.sis.service.param.BusinessParam;

public class GzTotalAccountComponent implements AccountComponent {

	@Override
	public String getTradeNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BusinessParam execute(BusinessParam t) {
		AccountHandler<String, Integer> handler = new GzAccountHandler();
		Integer result = handler.handle("hello world");
		System.out.println(result);
		return null;
	}

}
