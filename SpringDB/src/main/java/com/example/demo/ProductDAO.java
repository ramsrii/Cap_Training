package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductDAO {
	@Autowired
	JdbcTemplate jdbctemplate;
	String SQL_SELECT="select * from Product";
	
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbctemplate=jdbcTemplate;
}
	
public int addProduct(Product p)
{
	String query="insert into Product values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPdesc()+"','"+p.getDomf()+"','"+p.getDoexp()+"','"+p.getSupplier()+"','"+p.getQty()+"')";
	return jdbctemplate.update(query);
}
Product getProduct(int pid)
{
	String query="select * from Product where pid= ?";
	return jdbctemplate.queryForObject(query,  new Object[] { pid },new RowMapper<Product>() {
	@Override
	public Product mapRow(ResultSet rs,int rowNum)throws SQLException{
		return new Product(rs.getInt("pid"),rs.getString("Pname"),rs.getString("pdesc"),rs.getString("domf"),rs.getString("doexp"),rs.getString("supplier"),rs.getInt("qty"));
		
	}
		
	});
	
}

}
