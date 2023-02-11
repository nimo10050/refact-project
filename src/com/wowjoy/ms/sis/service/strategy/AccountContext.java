package com.wowjoy.ms.sis.service.strategy;


public class AccountContext<T, E> {
	
	private AccountStrategy<T, E> accountStrategy;
	
	public E execute(T t) {
		return accountStrategy.execute(t);
	}
	
	public AccountContext(AccountStrategy<T, E> accountStrategy) {
		this.accountStrategy = accountStrategy;
	}
	
}
