package com.aithinkers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aithinkers.dao.AccountDao;
import com.aithinkers.dao.MembershipDaoImpl;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDao theAccountDao,MembershipDaoImpl theMembershipDao)
	{
		return runner->{		
			demoTheBeforeAdvice(theAccountDao,theMembershipDao);
		};
	}

	private void demoTheBeforeAdvice(AccountDao theAccountDao,MembershipDaoImpl theMembershipDao) {
		
		theAccountDao.addAccount(new Account(),true);
		theAccountDao.doWork();
		
		theAccountDao.setName("Swagat");
		theAccountDao.setServiceCode("Dev");
		theAccountDao.getName();
		theAccountDao.getServiceCode();
		
		theMembershipDao.addMember();
	}

}
