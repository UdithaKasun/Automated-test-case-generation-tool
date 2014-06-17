
/**
 * DiscoveryAdminStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Sep 04, 2013 (02:02:54 UTC)
 */
        package org.wso2.carbon.discovery.admin.stub.types;

        

        /*
        *  DiscoveryAdminStub java implementation
        */

        
        public class DiscoveryAdminStub extends org.apache.axis2.client.Stub
        implements DiscoveryAdmin{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("DiscoveryAdmin" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[10];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "getDiscoveryProxy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "resolveTargetService"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "enableServiceDiscovery"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "disableServiceDiscovery"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "addDiscoveryProxy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "getServiceDiscoveryConfig"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "removeDiscoveryProxy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "getDiscoveryProxies"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "probeDiscoveryProxy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                    __operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org", "updateDiscoveryProxy"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "resolveTargetService"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "resolveTargetService"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "resolveTargetService"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "enableServiceDiscovery"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "enableServiceDiscovery"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "enableServiceDiscovery"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "disableServiceDiscovery"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "disableServiceDiscovery"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "disableServiceDiscovery"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "addDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "addDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "addDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getServiceDiscoveryConfig"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getServiceDiscoveryConfig"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getServiceDiscoveryConfig"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "removeDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "removeDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "removeDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getDiscoveryProxies"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getDiscoveryProxies"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "getDiscoveryProxies"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "probeDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "probeDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "probeDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "updateDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "updateDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.Exception");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://org.apache.synapse/xsd","Exception"), "updateDiscoveryProxy"),"org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public DiscoveryAdminStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public DiscoveryAdminStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public DiscoveryAdminStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://localhost:8243/services/DiscoveryAdmin.DiscoveryAdminHttpsSoap12Endpoint" );
                
    }

    /**
     * Default Constructor
     */
    public DiscoveryAdminStub() throws org.apache.axis2.AxisFault {
        
                    this("https://localhost:8243/services/DiscoveryAdmin.DiscoveryAdminHttpsSoap12Endpoint" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public DiscoveryAdminStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#getDiscoveryProxy
                     * @param getDiscoveryProxy40
                    
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                     */

                    

                            public  org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails getDiscoveryProxy(

                            java.lang.String name41)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:getDiscoveryProxy");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    name41,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "getDiscoveryProxy")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetDiscoveryProxyResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxy"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxy"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxy"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                          throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#startgetDiscoveryProxy
                    * @param getDiscoveryProxy40
                
                */
                public  void startgetDiscoveryProxy(

                 java.lang.String name41,

                  final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:getDiscoveryProxy");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    name41,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "getDiscoveryProxy")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetDiscoveryProxy(
                                            getGetDiscoveryProxyResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetDiscoveryProxy(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxy"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxy"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxy"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
														callback.receiveErrorgetDiscoveryProxy((org.wso2.carbon.discovery.admin.stub.types.Exception)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetDiscoveryProxy(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxy(f);
                                            }
									    } else {
										    callback.receiveErrorgetDiscoveryProxy(f);
									    }
									} else {
									    callback.receiveErrorgetDiscoveryProxy(f);
									}
								} else {
								    callback.receiveErrorgetDiscoveryProxy(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetDiscoveryProxy(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#resolveTargetService
                     * @param resolveTargetService44
                    
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                     */

                    

                            public  org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails resolveTargetService(

                            java.lang.String name45,java.lang.String serviceId46)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("urn:resolveTargetService");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    name45,
                                                    serviceId46,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "resolveTargetService")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getResolveTargetServiceResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resolveTargetService"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resolveTargetService"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resolveTargetService"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                          throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#startresolveTargetService
                    * @param resolveTargetService44
                
                */
                public  void startresolveTargetService(

                 java.lang.String name45,java.lang.String serviceId46,

                  final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("urn:resolveTargetService");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    name45,
                                                    serviceId46,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "resolveTargetService")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultresolveTargetService(
                                            getResolveTargetServiceResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorresolveTargetService(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resolveTargetService"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resolveTargetService"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"resolveTargetService"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
														callback.receiveErrorresolveTargetService((org.wso2.carbon.discovery.admin.stub.types.Exception)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorresolveTargetService(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorresolveTargetService(f);
                                            }
									    } else {
										    callback.receiveErrorresolveTargetService(f);
									    }
									} else {
									    callback.receiveErrorresolveTargetService(f);
									}
								} else {
								    callback.receiveErrorresolveTargetService(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorresolveTargetService(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                 
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                  */
                public void  enableServiceDiscovery(
                 java.lang.String proxyURL50

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
                _operationClient.getOptions().setAction("urn:enableServiceDiscovery");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    proxyURL50,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                                    "enableServiceDiscovery")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"enableServiceDiscovery"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"enableServiceDiscovery"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"enableServiceDiscovery"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                                throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
             
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                  */
                public void  disableServiceDiscovery(
                 boolean sendBye52

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
                _operationClient.getOptions().setAction("urn:disableServiceDiscovery");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    sendBye52,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                                    "disableServiceDiscovery")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"disableServiceDiscovery"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"disableServiceDiscovery"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"disableServiceDiscovery"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                                throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
             
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                  */
                public void  addDiscoveryProxy(
                 org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails pd54

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
                _operationClient.getOptions().setAction("urn:addDiscoveryProxy");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    pd54,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                                    "addDiscoveryProxy")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addDiscoveryProxy"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addDiscoveryProxy"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"addDiscoveryProxy"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                                throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#getServiceDiscoveryConfig
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                     */

                    

                            public  org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig getServiceDiscoveryConfig(

                            )
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("urn:getServiceDiscoveryConfig");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                    //Style is taken to be "document". No input parameters
                                    // according to the WS-Basic profile in this case we have to send an empty soap message
                                    org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
                                    env = factory.getDefaultEnvelope();
                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetServiceDiscoveryConfigResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getServiceDiscoveryConfig"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getServiceDiscoveryConfig"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getServiceDiscoveryConfig"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                          throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#startgetServiceDiscoveryConfig
                */
                public  void startgetServiceDiscoveryConfig(

                 

                  final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("urn:getServiceDiscoveryConfig");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is taken to be "document". No input parameters
                                    // according to the WS-Basic profile in this case we have to send an empty soap message
                                    org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
                                    env = factory.getDefaultEnvelope();
                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetServiceDiscoveryConfig(
                                            getGetServiceDiscoveryConfigResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetServiceDiscoveryConfig(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getServiceDiscoveryConfig"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getServiceDiscoveryConfig"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getServiceDiscoveryConfig"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
														callback.receiveErrorgetServiceDiscoveryConfig((org.wso2.carbon.discovery.admin.stub.types.Exception)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetServiceDiscoveryConfig(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetServiceDiscoveryConfig(f);
                                            }
									    } else {
										    callback.receiveErrorgetServiceDiscoveryConfig(f);
									    }
									} else {
									    callback.receiveErrorgetServiceDiscoveryConfig(f);
									}
								} else {
								    callback.receiveErrorgetServiceDiscoveryConfig(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetServiceDiscoveryConfig(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                 
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                  */
                public void  removeDiscoveryProxy(
                 java.lang.String name59

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
                _operationClient.getOptions().setAction("urn:removeDiscoveryProxy");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    name59,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                                    "removeDiscoveryProxy")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeDiscoveryProxy"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeDiscoveryProxy"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"removeDiscoveryProxy"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                                throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#getDiscoveryProxies
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                     */

                    

                            public  org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails[] getDiscoveryProxies(

                            )
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("urn:getDiscoveryProxies");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                    //Style is taken to be "document". No input parameters
                                    // according to the WS-Basic profile in this case we have to send an empty soap message
                                    org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
                                    env = factory.getDefaultEnvelope();
                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getGetDiscoveryProxiesResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxies"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxies"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxies"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                          throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#startgetDiscoveryProxies
                */
                public  void startgetDiscoveryProxies(

                 

                  final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("urn:getDiscoveryProxies");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is taken to be "document". No input parameters
                                    // according to the WS-Basic profile in this case we have to send an empty soap message
                                    org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
                                    env = factory.getDefaultEnvelope();
                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetDiscoveryProxies(
                                            getGetDiscoveryProxiesResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetDiscoveryProxies(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxies"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxies"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"getDiscoveryProxies"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
														callback.receiveErrorgetDiscoveryProxies((org.wso2.carbon.discovery.admin.stub.types.Exception)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetDiscoveryProxies(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetDiscoveryProxies(f);
                                            }
									    } else {
										    callback.receiveErrorgetDiscoveryProxies(f);
									    }
									} else {
									    callback.receiveErrorgetDiscoveryProxies(f);
									}
								} else {
								    callback.receiveErrorgetDiscoveryProxies(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetDiscoveryProxies(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#probeDiscoveryProxy
                     * @param probeDiscoveryProxy63
                    
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                     */

                    

                            public  org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails[] probeDiscoveryProxy(

                            java.lang.String name64,org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails probe65)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("urn:probeDiscoveryProxy");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    name64,
                                                    probe65,
                                                    dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "probeDiscoveryProxy")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return getProbeDiscoveryProxyResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse)object);
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"probeDiscoveryProxy"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"probeDiscoveryProxy"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"probeDiscoveryProxy"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                          throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdmin#startprobeDiscoveryProxy
                    * @param probeDiscoveryProxy63
                
                */
                public  void startprobeDiscoveryProxy(

                 java.lang.String name64,org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails probe65,

                  final org.wso2.carbon.discovery.admin.stub.types.DiscoveryAdminCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("urn:probeDiscoveryProxy");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy dummyWrappedType = null;
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    name64,
                                                    probe65,
                                                     dummyWrappedType,
                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                    "probeDiscoveryProxy")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultprobeDiscoveryProxy(
                                            getProbeDiscoveryProxyResponse_return((org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse)object));
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorprobeDiscoveryProxy(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"probeDiscoveryProxy"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"probeDiscoveryProxy"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"probeDiscoveryProxy"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
														callback.receiveErrorprobeDiscoveryProxy((org.wso2.carbon.discovery.admin.stub.types.Exception)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorprobeDiscoveryProxy(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprobeDiscoveryProxy(f);
                                            }
									    } else {
										    callback.receiveErrorprobeDiscoveryProxy(f);
									    }
									} else {
									    callback.receiveErrorprobeDiscoveryProxy(f);
									}
								} else {
								    callback.receiveErrorprobeDiscoveryProxy(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorprobeDiscoveryProxy(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                 
                
                /**
                  * Auto generated method signature
                  * 
                     * @throws org.wso2.carbon.discovery.admin.stub.types.Exception : 
                  */
                public void  updateDiscoveryProxy(
                 org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails pd69

                ) throws java.rmi.RemoteException
                
                
                        ,org.wso2.carbon.discovery.admin.stub.types.Exception
                {
                org.apache.axis2.context.MessageContext _messageContext = null;

                try {
                org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
                _operationClient.getOptions().setAction("urn:updateDiscoveryProxy");
                _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

                
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              
                org.apache.axiom.soap.SOAPEnvelope env = null;
                 _messageContext = new org.apache.axis2.context.MessageContext();

                
                                                    //Style is Doc.
                                                    org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy dummyWrappedType = null;
                                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                                    pd69,
                                                                    dummyWrappedType,
                                                                    optimizeContent(new javax.xml.namespace.QName("http://discovery.carbon.wso2.org",
                                                                    "updateDiscoveryProxy")));
                                                                

              //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
                // create message context with that soap envelope

            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

             _operationClient.execute(true);

           
               }catch(org.apache.axis2.AxisFault f){
                  org.apache.axiom.om.OMElement faultElt = f.getDetail();
                  if (faultElt!=null){
                      if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateDiscoveryProxy"))){
                          //make the fault by reflection
                          try{
                              java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateDiscoveryProxy"));
                              java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                              java.lang.Exception ex=
                                      (java.lang.Exception) exceptionClass.newInstance();
                              //message class
                              java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"updateDiscoveryProxy"));
                              java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                              java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                              java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                         new java.lang.Class[]{messageClass});
                              m.invoke(ex,new java.lang.Object[]{messageObject});
                              
                              if (ex instanceof org.wso2.carbon.discovery.admin.stub.types.Exception){
                                throw (org.wso2.carbon.discovery.admin.stub.types.Exception)ex;
                              }
                              

                              throw new java.rmi.RemoteException(ex.getMessage(), ex);
                          }catch(java.lang.ClassCastException e){
                             // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.ClassNotFoundException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }catch (java.lang.NoSuchMethodException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          } catch (java.lang.reflect.InvocationTargetException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }  catch (java.lang.IllegalAccessException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }   catch (java.lang.InstantiationException e) {
                              // we cannot intantiate the class - throw the original Axis fault
                              throw f;
                          }
                      }else{
                          throw f;
                      }
                  }else{
                      throw f;
                  }
              } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
              }
           
             return;
           }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://localhost:8243/services/DiscoveryAdmin.DiscoveryAdminHttpsSoap12Endpoint
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy();

                                 
                                              wrappedType.setName(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails getGetDiscoveryProxyResponse_return(
                                org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    java.lang.String param2,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService();

                                 
                                              wrappedType.setName(param1);
                                         
                                              wrappedType.setServiceId(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails getResolveTargetServiceResponse_return(
                                org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery();

                                 
                                              wrappedType.setProxyURL(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    boolean param1,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery();

                                 
                                              wrappedType.setSendBye(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails param1,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy();

                                 
                                              wrappedType.setPd(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig getGetServiceDiscoveryConfigResponse_return(
                                org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy();

                                 
                                              wrappedType.setName(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails[] getGetDiscoveryProxiesResponse_return(
                                org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    java.lang.String param1,
                                    org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails param2,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy();

                                 
                                              wrappedType.setName(param1);
                                         
                                              wrappedType.setProbe(param2);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             

                                
                                private org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails[] getProbeDiscoveryProxyResponse_return(
                                org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse wrappedType){
                                
                                        return wrappedType.get_return();
                                    
                                }
                             
                                    
                                private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
                                    org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails param1,
                                    org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy dummyWrappedType,
                                 boolean optimizeContent) throws org.apache.axis2.AxisFault{

                                try{
                                org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy wrappedType = new org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy();

                                 
                                              wrappedType.setPd(param1);
                                         

                               org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                  
                                        emptyEnvelope.getBody().addChild(wrappedType.getOMElement(org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy.MY_QNAME,factory));
                                    

                                return emptyEnvelope;
                               } catch(org.apache.axis2.databinding.ADBException e){
                                    throw org.apache.axis2.AxisFault.makeFault(e);
                               }
                               }



                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ResolveTargetServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.EnableServiceDiscovery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.DisableServiceDiscovery.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.AddDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.GetServiceDiscoveryConfigResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.RemoveDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.GetDiscoveryProxiesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ProbeDiscoveryProxyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.UpdateDiscoveryProxy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.class.equals(type)){
                
                           return org.wso2.carbon.discovery.admin.stub.types.synapse.ExceptionE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   