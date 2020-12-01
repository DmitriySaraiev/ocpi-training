package com.saraiev.ocpitraining.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataApiResponse<T> extends BaseApiResponse {

    @JsonProperty("data")
    private T data;

    public DataApiResponse(int resultCode, String resultText, T data) {
        super(resultCode, resultText);
        this.data = data;
    }

    public DataApiResponse(T data) {
        super(200, "Success");
        this.data = data;
    }

}
