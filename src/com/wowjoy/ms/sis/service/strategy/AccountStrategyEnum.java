package com.wowjoy.ms.sis.service.strategy;

public enum AccountStrategyEnum {

	GzAccountStrategyEnum("1024", GzAccountStrategy.class);
	
	
	private String mediInsureId;
	
	private Class<?> strategyCls;
	
	
	AccountStrategyEnum(String mediInsureId, Class<?> strategyCls) {
		this.mediInsureId = mediInsureId;
		this.strategyCls = strategyCls;
	}
	
	public static AccountStrategy getAccountStrategy(String mediInsureId) {
		for(AccountStrategyEnum strategyEnum: AccountStrategyEnum.values()) {
			if(strategyEnum.mediInsureId.equals(mediInsureId)) {
				AccountStrategy strategy = null;
				try {
					strategy = (AccountStrategy) strategyEnum.strategyCls.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				return strategy;
			}
		}
		return null;
	}
	
}
