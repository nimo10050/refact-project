package com.wowjoy.ms.sis.service.strategy;

import com.wowjoy.ms.sis.service.handler.AccountHandler;

public class AccountContext<T, E> {
	
	private AccountStrategy<T, E> accountStrategy;
	
	public E execute(AccountHandler<T, E> handler, T t) {
		return accountStrategy.execute(AccountHandler<T, E> handler, t);
	}
	
	public AccountContext(AccountStrategy<T, E> accountStrategy) {
		this.accountStrategy = accountStrategy;
	}
	
}
