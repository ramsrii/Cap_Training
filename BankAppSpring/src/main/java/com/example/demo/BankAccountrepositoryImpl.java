package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
interface BankAccountRepository
{
	public double getBalance(long accountId);
	public double updateBalance(long accountId,double newBalance);
}

public class BankAccountrepositoryImpl implements BankAccountRepository
{
	@Autowired
	static JdbcTemplate jdbctemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbctemplate)
	{
		BankAccountrepositoryImpl.jdbctemplate=jdbctemplate;
	}
	@Override
	public double getBalance(long accountId)
	{
		String SQL_SELECT="select * from BankAccount where accountid= "+accountId;
		List<BankAccount> account=jdbctemplate.query(SQL_SELECT,new BeanPropertyRowMapper<BankAccount>(BankAccount.class));
		return account.get(0).getAccountBalance();
		//String sqlQuery = "select accountBalance from bankaccount where accountId = ?";
		//return jdbctemplate.queryForObject(sqlQuery,  new Object[] { accountId }, Double.class);
	}
	@Override
	public double updateBalance(long accountId,double newBalance)
	{
		String SQL_UPDATE="update BankAccount set accountbalance=(?) where accountid=(?)";
		return jdbctemplate.update(SQL_UPDATE,newBalance,accountId);
	}
	
	

}
