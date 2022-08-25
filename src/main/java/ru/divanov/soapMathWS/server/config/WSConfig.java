package ru.divanov.soapMathWS.server.config;


import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import ru.divanov.soapMathWS.server.service.ObjectFactory;
import ru.divanov.soapMathWS.server.service.SoapMathServiceImpl;
import sun.java2d.pipe.SpanShapeRenderer;

import javax.xml.ws.Endpoint;

@Configuration
public class WSConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint soapEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new SoapMathServiceImpl());
        endpoint.publish("/SoapMathService");
        return endpoint;
    }
}
