package com.stackroute.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter {

   // Need to override filterType, filterOrder, shouldFilter and run methods.
    // Here filterType method can only return any one of four String – pre/post/route/error.
    // Depending on this value the filter will act like a particular filter.
    //run method is the place where our filter logic should be placed
    // depending on our requirement.
    //Also we can add any number of any particular filter based on our need,
    // this case filterOrder will come into place to determine the order
    // of that filer at the phase of execution of that type of filter.

    @Override
    public String filterType() {
        return "error";
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
        System.out.println("Inside Error Filter");
        return null;
    }
}
