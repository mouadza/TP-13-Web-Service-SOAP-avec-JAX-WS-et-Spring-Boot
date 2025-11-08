package com.example.tp13.config;

import com.example.tp13.ws.CompteSoapService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Bean
    public Endpoint banqueWsEndpoint(Bus bus, CompteSoapService compteSoapService) {
        EndpointImpl endpoint = new EndpointImpl(bus, compteSoapService);
        endpoint.publish("/ws"); // => /services/ws?wsdl par défaut
        return endpoint;
    }
}
