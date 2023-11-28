package com.pelayo.architecture.ioc.jenkins;


import com.pelayo.architecture.ioc.IExecutor

public class JenkinsExecutorImpl implements IExecutor{

    private Object _environment;


    public JenkinsExecutorImpl(environment){
        this._environment = environment;
	

    }

	
	@Override
	public void println(String string) {
		_environment.println (string);
		
	}


	@Override
	public String readFile(String file) {
		
		return _environment.readFile(file);
	}


	@Override
	public String sh(String command) {
		return _environment.sh(returnStdout: true, script:command).trim()
		//return "";
	}


	@Override
	public void withCredentials(String credentialId, Object body) {
		  _environment.withCredentials([string(credentialsId: credentialId, variable: 'item')]) {
			 body(item);
		 }
		
	}


	@Override
	public void error(String string) {
		_environment.error(string);
		
	}
    


}