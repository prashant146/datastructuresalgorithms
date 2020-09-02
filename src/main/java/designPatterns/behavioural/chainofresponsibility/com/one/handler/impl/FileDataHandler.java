package designPatterns.behavioural.chainofresponsibility.com.one.handler.impl;

import designPatterns.behavioural.chainofresponsibility.com.one.handler.RequestHandler;
import designPatterns.behavioural.chainofresponsibility.com.one.model.RequestData;

public class FileDataHandler implements RequestHandler {

    private RequestHandler requestHandler;
    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }
    @Override
    public boolean process(RequestData requestData) {
        requestData.setMetaFileData("Meta Data from File is populated");
        return requestHandler == null ? true : requestHandler.process(requestData);
    }
}
