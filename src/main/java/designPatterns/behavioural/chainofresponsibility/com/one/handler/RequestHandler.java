package designPatterns.behavioural.chainofresponsibility.com.one.handler;

import designPatterns.behavioural.chainofresponsibility.com.one.model.RequestData;

public interface RequestHandler {

    void setNextRequestHandler(RequestHandler requestHandler);
    boolean process(RequestData requestData);

}
