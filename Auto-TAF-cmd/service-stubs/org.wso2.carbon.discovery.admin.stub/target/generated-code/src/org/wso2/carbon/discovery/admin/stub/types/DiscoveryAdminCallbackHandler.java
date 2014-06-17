
/**
 * DiscoveryAdminCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.discovery.admin.stub.types;

    /**
     *  DiscoveryAdminCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DiscoveryAdminCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DiscoveryAdminCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DiscoveryAdminCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getDiscoveryProxy method
            * override this method for handling normal response from getDiscoveryProxy operation
            */
           public void receiveResultgetDiscoveryProxy(
                    org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDiscoveryProxy operation
           */
            public void receiveErrorgetDiscoveryProxy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for resolveTargetService method
            * override this method for handling normal response from resolveTargetService operation
            */
           public void receiveResultresolveTargetService(
                    org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from resolveTargetService operation
           */
            public void receiveErrorresolveTargetService(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getServiceDiscoveryConfig method
            * override this method for handling normal response from getServiceDiscoveryConfig operation
            */
           public void receiveResultgetServiceDiscoveryConfig(
                    org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceDiscoveryConfig operation
           */
            public void receiveErrorgetServiceDiscoveryConfig(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for getDiscoveryProxies method
            * override this method for handling normal response from getDiscoveryProxies operation
            */
           public void receiveResultgetDiscoveryProxies(
                    org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getDiscoveryProxies operation
           */
            public void receiveErrorgetDiscoveryProxies(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for probeDiscoveryProxy method
            * override this method for handling normal response from probeDiscoveryProxy operation
            */
           public void receiveResultprobeDiscoveryProxy(
                    org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from probeDiscoveryProxy operation
           */
            public void receiveErrorprobeDiscoveryProxy(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                


    }
    