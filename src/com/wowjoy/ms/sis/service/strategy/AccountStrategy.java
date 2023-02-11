package com.wowjoy.ms.sis.service.strategy;

public interface AccountStrategy<T, E> {
	
	E execute(T t);

}
