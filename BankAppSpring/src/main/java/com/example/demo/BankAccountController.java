package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountController {
	@Autowired
	BankAccountService service;
	public void setService(BankAccountService service)
	{
		this.service=service;
	}
	public BankAccountController()
	{
		super();
	}
	public void withdrawOfBalance(long accountId,double balance)
	{
		System.out.println(service.withdraw(accountId, balance));
	}
	public void DepositOfAmount(long accountId,double balance)
	{
		System.out.println(service.deposit(accountId, balance));
	}
	public void GetBalance(long accountId)
	{
		System.out.println(service.getBalance(accountId));
	}
	public void FundTransfer(long fromAccount,long toAccount,double amount)
	{
		System.out.println(service.fundTransfer(fromAccount,toAccount,amount));
	}

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		BankAccountController con=(BankAccountController)ctx.getBean("control");
		BankAccount Account=(BankAccount)ctx.getBean("acc");
		con.DepositOfAmount(Account.getAccountId(),400);
		
		
	}
	

}
