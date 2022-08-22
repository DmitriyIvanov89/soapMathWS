package ru.divanov.soapMathWS.config;


import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.divanov.soapMathWS.service.SoapMathServiceImpl;

import javax.xml.ws.Endpoint;

@Configuration
public class WSConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint soapEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new SoapMathServiceImpl());
        endpoint.publish("http://localhost:8080/services/SoapMathService");
        return endpoint;
    }

}
