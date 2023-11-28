package com.pelayo.architecture.ioc.jenkins;

import com.pelayo.architecture.ioc.IConfiguration
import com.pelayo.architecture.ioc.IContext
import com.pelayo.architecture.ioc.IExecutor

class JenkinsContext implements IContext, Serializable {
    // the same as in the StepExecutor class
    private final IConfiguration configuration;
    private final IExecutor executor;

    JenkinsContext(environment, scm) {
       
        this.executor = new JenkinsExecutorImpl(environment);
        this.configuration = new JenkinsConfigurationImpl(environment,scm);
    }

	@Override
	public IExecutor getExecutor() {
		
		return executor;
	}

	@Override
	public IConfiguration getConfiguration() {
	
		return configuration;
	}


}