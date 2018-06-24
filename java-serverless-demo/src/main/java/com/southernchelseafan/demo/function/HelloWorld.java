package com.southernchelseafan.demo.function;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.southernchelseafan.demo.domain.DemoRequest;

/**
 * Lambda function that simply prints "Hello World" if the input String is not provided,
 * otherwise, print "Hello " with the provided input String.
 */
public class HelloWorld implements RequestHandler<DemoRequest, String> {
    @Override
    public String handleRequest(DemoRequest input, Context context) {
        String output = "Hello " + ((input != null) ? input.getName() : "World");
        context.getLogger().log(output);
        return output;
    }
}