package com.pavan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pavan.beans.*;
import com.pavan.factory.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/pavan/resources/applicationContext.xml");
	
		AccountFactory savingsAccountFactory = (AccountFactory)context.getBean("savingsAccountFactory");
		SavingsAccount savingsAccount = (SavingsAccount)savingsAccountFactory.getAccount();
		savingsAccount.createAccount();
		savingsAccount.searchAccount();
		savingsAccount.updateAccount();
		savingsAccount.deleteAccount();
		System.out.println();
		
		AccountFactory currentAccountFactory = (AccountFactory)context.getBean("currentAccountFactory");
		CurrentAccount currentAccount = (CurrentAccount)currentAccountFactory.getAccount();
		currentAccount.createAccount();
		currentAccount.searchAccount();
		currentAccount.updateAccount();
		currentAccount.deleteAccount();
		
        /*OUTPUT
         
        Savings Account Created
		Savings Account identified
		Savings Account updated
		Savings Account deleted
		
		Current Account Created
		Current Account identified
		Current Account updated
		Current Account deleted
        */
	}

}
