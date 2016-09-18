package com.inveno.abtest.abtest;


public class Constants {

	public final static String COLOR_THRIFT_IP;
	
	public final static String COLOR_THRIFT_PORT;
	
	public final static String UID;
	
	public final static String PRODUCT_ID;
	
	public final static String APP_VER;
	
	static
	{
		Config config = new Config("abtest.properties");
		
		COLOR_THRIFT_IP = config.getProperty("color.thrift.ip");
		COLOR_THRIFT_PORT = config.getProperty("color.thrift.port");
		
		UID = config.getProperty("uid");
		PRODUCT_ID = config.getProperty("product_id");
		APP_VER = config.getProperty("app_ver");
		
		
	}
}
