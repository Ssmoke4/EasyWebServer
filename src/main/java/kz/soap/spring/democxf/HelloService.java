package kz.soap.spring.democxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "", name = "HelloService")
public interface HelloService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
            localName = "sayHello",
            targetNamespace = "https://service.ws.sample/",
            className = "kz.soap.spring.democxf.HelloService")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(
            localName = "sayHelloResponse",
            targetNamespace = "https://service.ws.sample/",
            className = "kz.soap.spring.democxf.sayHelloResponse")
    String sayHello(@WebParam(name = "name", targetNamespace = "") String name);
}
