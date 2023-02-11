package com.wowjoy.ms.sis.service.handler;


import com.wowjoy.ms.sis.service.component.AccountComponent;

public class AccountHandler<T extends AccountComponent, E> {
		
	public E handle(T t) {
		
		return execute(t);
	}

	private E execute(T t) {
		return t.execute(t);;
	}

}
