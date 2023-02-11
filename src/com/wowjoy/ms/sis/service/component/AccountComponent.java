package com.wowjoy.ms.sis.service.component;

public interface AccountComponent<T, E> {
	
	E execute(T t);

	String getTradeNo();
}
