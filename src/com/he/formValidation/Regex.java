package com.he.formValidation;

public class Regex {
    static private String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    static private String urlRegex = "^((((https?|ftps?|gopher|telnet|nntp)://)|(mailto:|news:))(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$,A-Za-z0-9])+)([).!';/?:,][[:blank:]])?$";
    
    static public String getEmailRegex(){
        return Regex.emailRegex;
    }
    
    static public String getUrlRegex(){
        return Regex.urlRegex;
    }
}
