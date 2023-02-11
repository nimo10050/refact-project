package com.wowjoy.ms.sis.service.component;

import com.wowjoy.ms.sis.service.constant.AccountConstants;

public class GzTotalAccountComponent implements AccountComponent<String, Integer> {



	@Override
	public String getTradeNo() {
		// TODO Auto-generated method stub
		return AccountConstants.TRADE_NO_3101;
	}

	@Override
	public Integer execute(String t) {
		// TODO Auto-generated method stub
		return null;
	}

}
