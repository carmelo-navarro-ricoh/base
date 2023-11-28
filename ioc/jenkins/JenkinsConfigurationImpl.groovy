package com.pelayo.architecture.ioc.jenkins;

import com.pelayo.architecture.ioc.IConfiguration

public class JenkinsConfigurationImpl implements IConfiguration{

    private Object _environment;
	private Object _scm;

    public JenkinsConfigurationImpl(environment,scm){
        this._environment = environment;
		this._scm = scm;

    }
	
	@Override
	public String getProps(String string) {
		return _environment.getProperty(string);
	}

	
	


}