package com.aithinkers.dao;

import java.util.List;

import com.aithinkers.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
    
    List<Account> findAccounts();
    
    List<Account> findAccounts(boolean tripWire);
}
