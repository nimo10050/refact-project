package com.wowjoy.ms.sis.service.config;

public class AccountConfig {

	private String mediInsureId;
	
	private String tradeNo;

	public AccountConfig(String mediInsureId, String tradeNo) {
		this.mediInsureId = mediInsureId;
		this.tradeNo = tradeNo;
	}

	public String getMediInsureId() {
		return mediInsureId;
	}

	public void setMediInsureId(String mediInsureId) {
		this.mediInsureId = mediInsureId;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	
}
