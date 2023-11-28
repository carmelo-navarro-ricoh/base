package com.pelayo.architecture.ioc;


interface IContext {
    
    IExecutor getExecutor()

    IConfiguration getConfiguration()

    
}