package com.training.test;

import org.springframework.stereotype.Component;

@Component
public class DBdao {
private String drivername,usernmae,password,url;

public DBdao() {
	super();
}

public DBdao(String drivername, String usernmae, String password, String url) {
	super();
	this.drivername = drivername;
	this.usernmae = usernmae;
	this.password = password;
	this.url = url;
}

public String getDrivername() {
	return drivername;
}

public void setDrivername(String drivername) {
	this.drivername = drivername;
}

public String getUsernmae() {
	return usernmae;
}

public void setUsernmae(String usernmae) {
	this.usernmae = usernmae;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "DBdao [drivername=" + drivername + ", usernmae=" + usernmae + ", password=" + password + ", url=" + url
			+ "]";
}

}