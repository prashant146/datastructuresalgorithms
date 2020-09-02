package designPatterns.behavioural.chainofresponsibility.com.two.handler.impl;

import designPatterns.behavioural.chainofresponsibility.com.two.handler.AuthenticationProcessor;
import designPatterns.behavioural.chainofresponsibility.com.two.handler.AuthenticationProvider;

public class UsernamePasswordAuthenticationProcessor extends AuthenticationProcessor {

    public UsernamePasswordAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if (authProvider instanceof UsernamePasswordProvider) {
            return Boolean.TRUE;
        } else if (nextProcessor != null) {
            return nextProcessor.isAuthorized(authProvider);
        } else {
            return Boolean.FALSE;
        }
    }
}
