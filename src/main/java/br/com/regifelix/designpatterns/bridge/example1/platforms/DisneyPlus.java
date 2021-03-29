package br.com.regifelix.designpatterns.bridge.example1.platforms;

public class DisneyPlus implements IPlatform{
    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: transmissão iniciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta autorizada!");

    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação.");

    }

    @Override
    public String getName() {
        return "DisneyPlus";

    }
}
