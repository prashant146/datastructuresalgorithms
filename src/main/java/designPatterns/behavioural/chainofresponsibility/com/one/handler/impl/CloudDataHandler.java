package designPatterns.behavioural.chainofresponsibility.com.one.handler.impl;

import designPatterns.behavioural.chainofresponsibility.com.one.handler.RequestHandler;
import designPatterns.behavioural.chainofresponsibility.com.one.model.RequestData;

public class CloudDataHandler implements RequestHandler {

    private RequestHandler requestHandler;
    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }
    @Override
    public boolean process(RequestData requestData) {
        requestData.setMetaCloudData("Meta Data from Cloud is populated");
        return requestHandler == null ? true : requestHandler.process(requestData);
    }
}
