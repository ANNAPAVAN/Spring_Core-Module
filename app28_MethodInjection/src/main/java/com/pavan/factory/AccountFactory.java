package com.pavan.factory;
import com.pavan.beans.*;

public abstract class AccountFactory {
	public abstract Account getAccount();
	//it may return SavingsAccount or may return CurrentAccount 
}
