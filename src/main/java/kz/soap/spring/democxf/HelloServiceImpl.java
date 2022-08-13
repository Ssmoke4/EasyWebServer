package kz.soap.spring.democxf;

import javax.jws.WebService;

@WebService(
        serviceName = "Hello",
        portName = "HelloPort",
        targetNamespace = "https://service.ws.sample/",
        endpointInterface = "kz.soap.spring.democxf.HelloService")
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }
}
