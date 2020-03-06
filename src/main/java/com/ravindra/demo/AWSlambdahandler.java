package com.ravindra.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class AWSlambdahandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent,APIGatewayProxyResponseEvent> {

	//todo handler<input,output><request,response>
}
