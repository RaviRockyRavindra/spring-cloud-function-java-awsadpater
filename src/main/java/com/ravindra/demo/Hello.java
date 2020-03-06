package com.ravindra.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;


import org.springframework.beans.factory.annotation.Autowired;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

//handler function 

@Component
public class Hello implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
        
    	APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        
    	// status code 200
        // Input String is ...
    	
        responseEvent.setStatusCode(200);
        responseEvent.setBody("Input String is" + input.getBody());
       
        
        return responseEvent;
    
    
    }
}