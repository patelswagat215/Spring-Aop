package com.aithinkers.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// This is where we add all of our related advices for logging.

	// Lets start with @Before advice

	// @Before("execution (public void com.aithinkers.dao.AccountDao.addAccount())")
	// @Before("execution (public void add*())")
	// @Before("execution (void add*())")
	// @Before("execution (*void add*())")
	// @Before("execution (* add*(com.aithinkers.Account))")
	// @Before("execution (* add*(com.aithinkers.Account,. .))")
	// @Before("execution (* com.aithinkers..add*(. .))")

	// Pointcut for all methods in com.aithinkers.dao package
		@Pointcut("execution(* com.aithinkers.dao.*.*(..))") 
		private void forDaoPackage() {}

		// Pointcut for getter methods
		@Pointcut("execution(* com.aithinkers.dao.*.get*(..))")
		private void getter() {}

		// Pointcut for setter methods
		@Pointcut("execution(* com.aithinkers.dao.*.set*(..))")
		private void setter() {}

		// Composite pointcut: include DAO methods, exclude getters/setters
		@Pointcut("forDaoPackage() && !(getter() || setter())")
		private void forDaoPackageNoGetterSetter() {}

		@Before("forDaoPackageNoGetterSetter()")
		public void beforeAddAccountAdvice() {
			System.out.println("\n=====> Executing @Before advice beforeAddAccountAdvice()");
		}
}
