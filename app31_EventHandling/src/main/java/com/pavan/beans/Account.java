package com.pavan.beans;
import com.pavan.publisher.*;

public class Account {
	
	
	private AccountEventPublisher publisher;
	
	
	public AccountEventPublisher getPublisher() {
		return publisher;
	}
	public void setPublisher(AccountEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	
	public void createAccount()
	{
		System.out.println("Account Created...");
		publisher.publish("Acc Created");
	}
	public void searchAccount()
	{
		System.out.println("Account Identified....");
		publisher.publish("Acc Identified");
	}
	public void updateAccount()
	{
		System.out.println("Account Updated...");
		publisher.publish("Acc Updated");
	}
	public void deleteAccount()
	{
		System.out.println("Account Deleted....");
		publisher.publish("Acc Deleted");
	}
}
