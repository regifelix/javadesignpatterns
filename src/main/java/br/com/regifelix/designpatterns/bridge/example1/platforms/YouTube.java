package br.com.regifelix.designpatterns.bridge.example1.platforms;

public class YouTube implements IPlatform{
    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: transmissão iniciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: Configurado broadcasting!");

    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicação.");

    }

    @Override
    public String getName() {
        return "YouTube";
    }
}
