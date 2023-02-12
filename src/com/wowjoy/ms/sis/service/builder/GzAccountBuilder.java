//package com.wowjoy.ms.sis.service.builder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.wowjoy.ms.sis.service.component.AccountComponent;
//import com.wowjoy.ms.sis.service.component.GzTotalAccountComponent;
//import com.wowjoy.ms.sis.service.config.AccountConfig;
//import com.wowjoy.ms.sis.service.handler.AccountHandler;
//
//public class GzAccountBuilder implements AccountBuilder<String, Integer> {
//
//	@Override
//	public AccountHandler<String, Integer> build(AccountConfig config) {
//		AccountHandler<String, Integer> handler = new AccountHandler<>();
//		List<AccountComponent<String, Integer>> componentList = new ArrayList<>();
//		componentList.add(new GzTotalAccountComponent());
//		handler.setComponentList(componentList);
//		return null;
//	}
//}
