package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;// initialize class variable of p

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\sathi\\eclipse-workspace\\Adactin_Project_Sathish\\src\\main\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fi = new FileInputStream(f);// FileNotFoundException
		p = new Properties();
		p.load(fi);
	}

	public String getbrowser() {
		String br = p.getProperty("Browser");
		return br;

	}

	public String getUrl() {
		String url = p.getProperty("Url");
		return url;

	}

	public String getreader() {
		String Reader = p.getProperty("Reader");
		return Reader;
	}

}
