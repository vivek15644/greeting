/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author vivek
 */
public class ResponseData {
    private String response_code;
    private String response_description;
    
    private Response response_data;

    public Response getResponse_data() {
        return response_data;
    }

    public void setResponse_data(Response response_data) {
        this.response_data = response_data;
    }

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
    
}
