package com.wowjoy.ms.sis.service.component;

import com.wowjoy.ms.sis.service.param.BusinessParam;

public interface AccountComponent {
	
	BusinessParam execute(BusinessParam param);
	
	String getTradeNo();
}
