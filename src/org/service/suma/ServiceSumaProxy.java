package org.service.suma;

public class ServiceSumaProxy implements org.service.suma.ServiceSuma {
  private String _endpoint = null;
  private org.service.suma.ServiceSuma serviceSuma = null;
  
  public ServiceSumaProxy() {
    _initServiceSumaProxy();
  }
  
  public ServiceSumaProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceSumaProxy();
  }
  
  private void _initServiceSumaProxy() {
    try {
      serviceSuma = (new org.service.suma.ServiceSumaServiceLocator()).getServiceSuma();
      if (serviceSuma != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceSuma)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceSuma)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceSuma != null)
      ((javax.xml.rpc.Stub)serviceSuma)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.service.suma.ServiceSuma getServiceSuma() {
    if (serviceSuma == null)
      _initServiceSumaProxy();
    return serviceSuma;
  }
  
  public void operacionSuma(int in0, int in1) throws java.rmi.RemoteException{
    if (serviceSuma == null)
      _initServiceSumaProxy();
    serviceSuma.operacionSuma(in0, in1);
  }
  
  
}