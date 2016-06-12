package BCCR_WS;

/**
 * WsIndicadoresEconomicosLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */


public class WsIndicadoresEconomicosLocator extends org.apache.axis.client.Service implements WsIndicadoresEconomicos {

    public WsIndicadoresEconomicosLocator() {
    }


    public WsIndicadoresEconomicosLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsIndicadoresEconomicosLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsIndicadoresEconomicosSoap12
    private java.lang.String wsIndicadoresEconomicosSoap12_address = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx";

    public java.lang.String getwsIndicadoresEconomicosSoap12Address() {
        return wsIndicadoresEconomicosSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsIndicadoresEconomicosSoap12WSDDServiceName = "wsIndicadoresEconomicosSoap12";

    public java.lang.String getwsIndicadoresEconomicosSoap12WSDDServiceName() {
        return wsIndicadoresEconomicosSoap12WSDDServiceName;
    }

    public void setwsIndicadoresEconomicosSoap12WSDDServiceName(java.lang.String name) {
        wsIndicadoresEconomicosSoap12WSDDServiceName = name;
    }

    public WsIndicadoresEconomicosSoap getwsIndicadoresEconomicosSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsIndicadoresEconomicosSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsIndicadoresEconomicosSoap12(endpoint);
    }

    public WsIndicadoresEconomicosSoap getwsIndicadoresEconomicosSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            WsIndicadoresEconomicosSoap12Stub _stub = new WsIndicadoresEconomicosSoap12Stub(portAddress, this);
            _stub.setPortName(getwsIndicadoresEconomicosSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsIndicadoresEconomicosSoap12EndpointAddress(java.lang.String address) {
        wsIndicadoresEconomicosSoap12_address = address;
    }


    // Use to get a proxy class for wsIndicadoresEconomicosSoap
    private java.lang.String wsIndicadoresEconomicosSoap_address = "http://indicadoreseconomicos.bccr.fi.cr/indicadoreseconomicos/WebServices/wsIndicadoresEconomicos.asmx";

    public java.lang.String getwsIndicadoresEconomicosSoapAddress() {
        return wsIndicadoresEconomicosSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsIndicadoresEconomicosSoapWSDDServiceName = "wsIndicadoresEconomicosSoap";

    public java.lang.String getwsIndicadoresEconomicosSoapWSDDServiceName() {
        return wsIndicadoresEconomicosSoapWSDDServiceName;
    }

    public void setwsIndicadoresEconomicosSoapWSDDServiceName(java.lang.String name) {
        wsIndicadoresEconomicosSoapWSDDServiceName = name;
    }

    public WsIndicadoresEconomicosSoap getwsIndicadoresEconomicosSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsIndicadoresEconomicosSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsIndicadoresEconomicosSoap(endpoint);
    }

    public WsIndicadoresEconomicosSoap getwsIndicadoresEconomicosSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            WsIndicadoresEconomicosSoapStub _stub = new WsIndicadoresEconomicosSoapStub(portAddress, this);
            _stub.setPortName(getwsIndicadoresEconomicosSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsIndicadoresEconomicosSoapEndpointAddress(java.lang.String address) {
        wsIndicadoresEconomicosSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (WsIndicadoresEconomicosSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                WsIndicadoresEconomicosSoap12Stub _stub = new WsIndicadoresEconomicosSoap12Stub(new java.net.URL(wsIndicadoresEconomicosSoap12_address), this);
                _stub.setPortName(getwsIndicadoresEconomicosSoap12WSDDServiceName());
                return _stub;
            }
            if (WsIndicadoresEconomicosSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                WsIndicadoresEconomicosSoapStub _stub = new WsIndicadoresEconomicosSoapStub(new java.net.URL(wsIndicadoresEconomicosSoap_address), this);
                _stub.setPortName(getwsIndicadoresEconomicosSoapWSDDServiceName());
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
        if ("wsIndicadoresEconomicosSoap12".equals(inputPortName)) {
            return getwsIndicadoresEconomicosSoap12();
        }
        else if ("wsIndicadoresEconomicosSoap".equals(inputPortName)) {
            return getwsIndicadoresEconomicosSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.sdde.bccr.fi.cr", "wsIndicadoresEconomicos");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.sdde.bccr.fi.cr", "wsIndicadoresEconomicosSoap12"));
            ports.add(new javax.xml.namespace.QName("http://ws.sdde.bccr.fi.cr", "wsIndicadoresEconomicosSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsIndicadoresEconomicosSoap12".equals(portName)) {
            setwsIndicadoresEconomicosSoap12EndpointAddress(address);
        }
        else 
if ("wsIndicadoresEconomicosSoap".equals(portName)) {
            setwsIndicadoresEconomicosSoapEndpointAddress(address);
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
