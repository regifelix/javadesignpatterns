package br.com.regifelix.designpatterns.bridge.example1.platforms;

public class FacebookLive implements IPlatform{

    public FacebookLive() {
        configureRMTP();
        System.out.println("Facebook: transmissão iniciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada!");

    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação.");

    }

    @Override
    public String getName() {
        return "Facebook";

    }
}
