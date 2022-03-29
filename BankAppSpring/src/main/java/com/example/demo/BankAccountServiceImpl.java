package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
interface BankAccountService
{
	public double withdraw(long accountId,double balance);
	public double deposit(long accountId,double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);
}
public class BankAccountServiceImpl implements BankAccountService
{
	@Autowired
	BankAccountRepository repo;
	public void setRepo(BankAccountRepository repo)
	{
		this.repo=repo;
	}
	
	@Override
	public double withdraw(long accountId,double balance)
	{
		var currbalance=repo.getBalance(accountId);
		if(currbalance>balance)
		{
			repo.updateBalance(accountId, currbalance-balance);
		}
		return repo.getBalance(accountId);
	}
	
	@Override
	public double deposit(long accountId,double balance)
	{
		var currbalance=repo.getBalance(accountId);
		repo.updateBalance(accountId,currbalance+balance);
		return repo.getBalance(accountId);
	}
	@Override
	public double getBalance(long accountId)
	{
		return repo.getBalance(accountId);
	}
	
	@Override
	public boolean fundTransfer(long fromAccount,long toAccount,double amount)
	{
		try
		{
			var currbalance=repo.getBalance(fromAccount);
			if(currbalance>amount)
			{
				repo.updateBalance(fromAccount, currbalance-amount);
				var currbalance1=repo.getBalance(toAccount);
				repo.updateBalance(toAccount, currbalance1+amount);
				return true;
			}
		}
		catch(Exception e)
		{
			return false;
		}
		return false;
	}
	
}
