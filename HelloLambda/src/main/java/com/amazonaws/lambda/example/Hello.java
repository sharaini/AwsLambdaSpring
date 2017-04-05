package com.amazonaws.lambda.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<HelloRequest, HelloResponse> {
	
	@Override
	public HelloResponse handleRequest(HelloRequest input, Context arg1) {
		// TODO Auto-generated method stub
		return new HelloResponse(input.getInput());
	}

}
