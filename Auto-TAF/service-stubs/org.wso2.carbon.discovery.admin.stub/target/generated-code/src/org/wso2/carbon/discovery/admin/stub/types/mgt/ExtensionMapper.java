
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v10  Built on : Apr 16, 2014 (01:16:09 UTC)
 */

        
            package org.wso2.carbon.discovery.admin.stub.types.mgt;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "DiscoveryProxyDetails".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.admin.stub.types.mgt.DiscoveryProxyDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://org.apache.synapse/xsd".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.admin.stub.types.synapse.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "TargetServiceDetails".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.admin.stub.types.mgt.TargetServiceDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ProbeDetails".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.admin.stub.types.mgt.ProbeDetails.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.discovery.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceDiscoveryConfig".equals(typeName)){
                   
                            return  org.wso2.carbon.discovery.admin.stub.types.mgt.ServiceDiscoveryConfig.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    