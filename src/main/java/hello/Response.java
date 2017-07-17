/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Date;

/**
 *
 * @author vivek
 */
class Response {
    private String greet_message;
    private Date greet_time;

    public String getGreet_message() {
        return greet_message;
    }

    public void setGreet_message(String greet_message) {
        this.greet_message = greet_message;
    }

    public Date getGreet_time() {
        return greet_time;
    }

    public void setGreet_time() {
        this.greet_time = new java.util.Date();
    }
}
