package com.aithinkers.dao;

import com.aithinkers.Account;

public interface AccountDao {
	
	void addAccount(Account theAccount,Boolean vipFlag);
	
	Boolean doWork();
	
	public String getName();

	public void setName(String name);

	public String getServiceCode();

	public void setServiceCode(String serviceCode);


}
