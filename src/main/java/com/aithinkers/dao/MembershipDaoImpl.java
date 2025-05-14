package com.aithinkers.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDaoImpl implements MembershipDao{

	@Override
	public void addMember() {
		System.out.println(getClass()+"Doing my DB work:Adding a member");
		
	}

}
