/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.extensions.adapters;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author vivek
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderServiceResponse {
    @JsonProperty("response_code")
    private String response_code;
    @JsonProperty("response_description")
    private String response_description;
//    private SummaryListData response;

//    public SummaryListData getResponse() {
//        return response;
//    }
//
//    public void setResponse(SummaryListData response) {
//        this.response = response;
//    }

    public String getResponse_code() {
        return response_code;
    }

    public void setResponse_code(String response_code) {
        this.response_code = response_code;
    }

    public String getResponse_description() {
        return response_description;
    }

    public void setResponse_description(String response_description) {
        this.response_description = response_description;
    }
    public OrderServiceResponse(String response_code, String response_description) {
        this.response_code = response_code;
        this.response_description = response_description;
    }
}
