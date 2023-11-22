package com.pavan.beans;

public class CurrentAccount implements Account{
	public void createAccount()
	{
		System.out.println("Current Account Created");
	}
	public void searchAccount()
	{
		System.out.println("Current Account identified");
	}
	public void updateAccount()
	{
		System.out.println("Current Account updated");
	}
	public void deleteAccount()
	{
		System.out.println("Current Account deleted");
	}
}
