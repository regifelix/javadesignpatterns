package br.com.regifelix.designpatterns.adpter.utils;

public class Token {

    private String token;

    public Token(){
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6Ikhjb2RlIiwiaWF0IjoxNTE2MjM5MDIyfQ.JTrECx8-1K7bSt739kYerhv7TMAKt3YTE7d3j6VYIlA";
    }

    public String getToken() {
        return token;
    }
}
