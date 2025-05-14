package com.aithinkers.dao;

import org.springframework.stereotype.Repository;

import com.aithinkers.Account;

import lombok.Data;

@Repository
public class AccountDaoImpl implements AccountDao {

	private String name;
	private String serviceCode;

	@Override
	public void addAccount(Account theAccount, Boolean vipFlag) {
		System.out.println(getClass() + "Doing my DB work:Adding an account");

	}

	@Override
	public Boolean doWork() {
		System.out.println("In Boolean doWork()");
		return true;
	}

	public String getName() {
		System.out.println("Bla");
		return "Service Name:-" + name;
	}

	public void setName(String name) {
		System.out.println("Bla");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println("Bla");
		return "Service Code:-" + serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println("Bla");
		this.serviceCode = serviceCode;
	}

}
