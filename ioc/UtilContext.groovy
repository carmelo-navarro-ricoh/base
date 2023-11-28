package com.pelayo.architecture.ioc;
/* Esta clase es para facilitar el uso de la libreria*/
public class UtilContext {
	
	
		
	public static void println(String string) {
		ContextRegistry.getContext().getExecutor().println (string);
			
		
		
	}
	
	public static void error(String string) {
		ContextRegistry.getContext().getExecutor().error (string);
			
		
		
	}
	
		
	public static String getProps(String string) {
		return ContextRegistry.getContext().getConfiguration().getProps(string);
	}
	
	public static void readFile(String string) {
		ContextRegistry.getContext().getExecutor().readFile (string);
			
	}
	
	public static void sh(String string) {
		ContextRegistry.getContext().getExecutor().sh (string);
			
	}
	
	public static void withCredentials(String credentialId, body) {
		ContextRegistry.getContext().getExecutor().withCredentials (credentialId, body);
			
	}
	

	
	

}
