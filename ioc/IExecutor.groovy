package com.pelayo.architecture.ioc;

interface IExecutor {
	
	void println(String string);
	
	String readFile (String file);
	void error(String string);
	
	String sh (String command);
	
	void withCredentials(String credentialId, body);

	
}