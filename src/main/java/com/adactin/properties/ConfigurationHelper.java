package com.adactin.properties;

import java.io.IOException;

public class ConfigurationHelper {
	private ConfigurationHelper() {

	}

	public static ConfigurationReader getinstanceCR() throws IOException {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;

	}

	public static ConfigurationHelper getinstance() {
		ConfigurationHelper helper = new ConfigurationHelper();
		return helper;

	}
}
