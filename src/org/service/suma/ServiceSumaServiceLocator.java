/**
 * ServiceSumaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.service.suma;

public class ServiceSumaServiceLocator extends org.apache.axis.client.Service implements org.service.suma.ServiceSumaService {

    public ServiceSumaServiceLocator() {
    }


    public ServiceSumaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceSumaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceSuma
    private java.lang.String ServiceSuma_address = "http://localhost:7171/WebServiceServidor/services/ServiceSuma";

    public java.lang.String getServiceSumaAddress() {
        return ServiceSuma_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceSumaWSDDServiceName = "ServiceSuma";

    public java.lang.String getServiceSumaWSDDServiceName() {
        return ServiceSumaWSDDServiceName;
    }

    public void setServiceSumaWSDDServiceName(java.lang.String name) {
        ServiceSumaWSDDServiceName = name;
    }

    public org.service.suma.ServiceSuma getServiceSuma() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceSuma_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceSuma(endpoint);
    }

    public org.service.suma.ServiceSuma getServiceSuma(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.service.suma.ServiceSumaSoapBindingStub _stub = new org.service.suma.ServiceSumaSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiceSumaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceSumaEndpointAddress(java.lang.String address) {
        ServiceSuma_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.service.suma.ServiceSuma.class.isAssignableFrom(serviceEndpointInterface)) {
                org.service.suma.ServiceSumaSoapBindingStub _stub = new org.service.suma.ServiceSumaSoapBindingStub(new java.net.URL(ServiceSuma_address), this);
                _stub.setPortName(getServiceSumaWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiceSuma".equals(inputPortName)) {
            return getServiceSuma();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://suma.service.org", "ServiceSumaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://suma.service.org", "ServiceSuma"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceSuma".equals(portName)) {
            setServiceSumaEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
