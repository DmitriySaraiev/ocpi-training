package com.saraiev.ocpitraining.api;

public class CommonResponses {

    public static BaseApiResponse successResponse() {
        return new BaseApiResponse(200, "Success");
    }

}
