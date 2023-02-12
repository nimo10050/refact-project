package com.wowjoy.ms.sis.service.strategy;

import com.wowjoy.ms.sis.service.handler.AccountHandler;

public interface AccountStrategy<T, E> {
	
	E execute(AccountHandler<T, E> handler, T t);

}
