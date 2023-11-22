package com.pavan.beans;

public class SavingsAccount implements Account{
	public void createAccount()
	{
		System.out.println("Savings Account Created");
	}
	public void searchAccount()
	{
		System.out.println("Savings Account identified");
	}
	public void updateAccount()
	{
		System.out.println("Savings Account updated");
	}
	public void deleteAccount()
	{
		System.out.println("Savings Account deleted");
	}
}
