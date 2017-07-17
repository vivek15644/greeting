/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.extensions.adapters.OrderServiceAdapter;
import hello.extensions.adapters.OrderServiceResponse;
import hello.extensions.adapters.Random;
import java.io.IOException;
import java.net.MalformedURLException;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author vivek
 */
@RestController
public class GreetingController {
    
    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
//    public @ResponseBody    JsonResponseBody createUser(@RequestBody String requestBody, @RequestHeader("code") String code,            @RequestHeader("client_id") String clientId){}
    public @ResponseBody
    String index() {
        return "Greetig from Spring boot";
    }

    @RequestMapping(value = "/modifygreeting", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    ResponseData modifyGreeting(@RequestBody String reqBody) throws IOException {
        JsonRequest jsonRequest = objectMapper.readValue(reqBody,JsonRequest.class);
        System.out.println(jsonRequest.request.greet);
        //creating response_data
        String greet_message = jsonRequest.request.greet+" vivek";
        Response response = new Response();
        response.setGreet_message(greet_message);
        response.setGreet_time();
        ResponseData responseData = new ResponseData();
        responseData.setResponse_code("0");
        responseData.setResponse_description("SUCCESS");
        responseData.setResponse_data(response);
        return responseData;
    }
    
    @RequestMapping(value = "/random",method = RequestMethod.GET)
    public @ResponseBody Random modData() throws IOException, MalformedURLException, ClassNotFoundException{
//        RestTemplate restTemplate = new RestTemplate();
//        Random random = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Random.class);
        OrderServiceAdapter adapter = new OrderServiceAdapter();
//        OrderServiceResponse resp = adapter.getSummaryList();
        Random resp = adapter.getSummaryList();
//        return resp.getResponse_code();
        return resp;
    }
}
