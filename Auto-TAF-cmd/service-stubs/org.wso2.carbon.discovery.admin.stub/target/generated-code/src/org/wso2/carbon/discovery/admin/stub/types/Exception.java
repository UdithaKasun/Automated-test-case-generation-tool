
/**
 * Exception.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

package org.wso2.carbon.discovery.admin.stub.types;

public class Exception extends java.lang.Exception{

    private static final long serialVersionUID = 1402396380958L;
    
    private org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE faultMessage;

    
        public Exception() {
            super("Exception");
        }

        public Exception(java.lang.String s) {
           super(s);
        }

        public Exception(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public Exception(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    