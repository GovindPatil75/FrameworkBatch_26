package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String path=System.getProperty("user.dir")+"\\Config\\Config.Properties";
		FileInputStream file=new FileInputStream(path);
		pro=new Properties();
		pro.load(file);
	}
	
	public String getBaseUrlQA1() {
		return pro.getProperty("BaseUrlQA1");
	}

}
