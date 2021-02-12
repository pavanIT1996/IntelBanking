package com.IntelBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File src= new File("C:\\Users\\Pavan\\git\\IntelBanking\\IntelBanking\\Configuration\\config.properties");
		try {
			FileInputStream file=new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
		}catch(Exception e) {
			System.out.println("Exception is : "+e.getMessage());
		}

	}
	
	
	public String getAppurl() {
		String url=pro.getProperty("applicationurl");
		return url;
	}
	
	public String getUsername() {
		String uname=pro.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	public String getChromePath() {
		String path=pro.getProperty("chromepath");
		return path;
	}
}
