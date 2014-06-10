

/**
 * DiscoveryAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */

    package org.wso2.carbon.discovery.admin.stub.types;

    /*
     *  DiscoveryAdmin java interface
     */

    public interface DiscoveryAdmin {
          

        /**
          * Auto generated method signature
          * 
                    * @param getDiscoveryProxy10
                
             * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */

         
                     public org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails getDiscoveryProxy(

                        java.lang.String name11)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getDiscoveryProxy10
            
          */
        public void startgetDiscoveryProxy(

            java.lang.String name11,

            final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param resolveTargetService14
                
             * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */

         
                     public org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails resolveTargetService(

                        java.lang.String name15,java.lang.String serviceId16)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param resolveTargetService14
            
          */
        public void startresolveTargetService(

            java.lang.String name15,java.lang.String serviceId16,

            final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */
        public void  enableServiceDiscovery(
         java.lang.String proxyURL20

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */
        public void  disableServiceDiscovery(
         boolean sendBye22

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */
        public void  addDiscoveryProxy(
         org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails pd24

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        

        /**
          * Auto generated method signature
          * 
             * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */

         
                     public org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig getServiceDiscoveryConfig(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetServiceDiscoveryConfig(

            

            final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */
        public void  removeDiscoveryProxy(
         java.lang.String name29

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        

        /**
          * Auto generated method signature
          * 
             * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */

         
                     public org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails[] getDiscoveryProxies(

                        )
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetDiscoveryProxies(

            

            final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param probeDiscoveryProxy33
                
             * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */

         
                     public org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails[] probeDiscoveryProxy(

                        java.lang.String name34,org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails probe35)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param probeDiscoveryProxy33
            
          */
        public void startprobeDiscoveryProxy(

            java.lang.String name34,org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails probe35,

            final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
         */
        public void  updateDiscoveryProxy(
         org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails pd39

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.discovery.admin.stub.types.Exception;

        

        
       //
       }
    