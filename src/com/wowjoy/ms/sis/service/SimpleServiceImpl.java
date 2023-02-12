package com.wowjoy.ms.sis.service;

import com.wowjoy.ms.sis.service.config.AccountConfig;
import com.wowjoy.ms.sis.service.constant.AccountConstants;
import com.wowjoy.ms.sis.service.facade.AccountFacade;
import com.wowjoy.ms.sis.service.param.BusinessParam;
import com.wowjoy.ms.sis.service.strategy.AccountContext;

public class SimpleServiceImpl {
	
	/**
	 * 请求入口
	 * @param mediInsureId
	 * @param tradeNo
	 */
	public void service(BusinessParam businessParam) {
		String mediInsureId = businessParam.getMediInsureId();
		AccountContext context = AccountFacade.getAccountContext(new AccountConfig(mediInsureId, AccountConstants.TRADE_NO_3101));
		BusinessParam result = context.execute(businessParam);
		System.out.println(result);
	}
	
}
