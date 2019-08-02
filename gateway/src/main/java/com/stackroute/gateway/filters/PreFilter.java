package com.stackroute.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class PreFilter extends ZuulFilter {

    // Need to override filterType, filterOrder, shouldFilter and run methods.
    // Here filterType method can only return any one of four String – pre/post/route/error.
    // Depedending on this value the filter will act like a particular filter.
    //run method is the place where our filter logic should be placed
    // depending on our requirement.
    //Also we can add any number of any particular filter based on our need,
    // this case filterOrder will come into place to determine the order
    // of that filer at the phase of execution of that type of filter.
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
        return null;
    }
}
