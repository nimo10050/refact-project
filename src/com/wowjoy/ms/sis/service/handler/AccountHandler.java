package com.wowjoy.ms.sis.service.handler;


public abstract class AccountHandler<T, E> {
		
	public E handle(T t) {
		
		return execute(t);
	}

	private E execute(T t) {
		return null;
	}

}
