package com.pelayo.architecture.ioc;

import com.pelayo.architecture.ioc.jenkins.JenkinsContext

class ContextRegistry implements Serializable {
    private static IContext _context;
  
    static void registerJenkinsContext(IContext con) {

        
            ContextRegistry._context = con;
        
    }

    static IContext getContext() {
        return _context
    }
}