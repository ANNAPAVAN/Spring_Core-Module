package com.pavan.handler;

import org.springframework.context.ApplicationListener;

import com.pavan.Event.AccountEvent;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent ae) {
		
		ae.generateLog();
	}

}
