package com.pavan.publisher;

import org.springframework.context.ApplicationEventPublisher;
import com.pavan.Event.*;
import org.springframework.context.ApplicationEventPublisherAware;

public class AccountEventPublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish(String message)
	{
		AccountEvent ae = new AccountEvent(this , message); //this ->current class object
		publisher.publishEvent(ae);
		
	}
}
