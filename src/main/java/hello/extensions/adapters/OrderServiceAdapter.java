/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.extensions.adapters;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import static jdk.nashorn.tools.ShellFunctions.input;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author vivek
 */
public class OrderServiceAdapter {

    @Autowired
    ObjectMapper objectMapper;

    public Random getSummaryList() throws MalformedURLException, IOException, ClassNotFoundException {
        final String uri = "http://gturnquist-quoters.cfapps.io/api/random";
//        final String uri = "http://orderservice.com/v1.0/order/summarylist?offset=0&limit=1";

        MultiValueMap<String, String> header = new LinkedMultiValueMap<String, String>();

        RestTemplate restTemplate = new RestTemplate();
        Random random = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Random.class);
        
        return random;
    }
}
