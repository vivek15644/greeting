/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.extensions.adapters;

/**
 *
 * @author vivek
 */
public class Headers {
    private String userMdn;
    private String authorisation;
    private String code;

    public String getUserMdn() {
        return userMdn;
    }

    public void setUserMdn(String userMdn) {
        this.userMdn = userMdn;
    }

    public String getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(String authorisation) {
        this.authorisation = authorisation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
