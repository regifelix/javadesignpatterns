package br.com.regifelix.designpatterns.bridge.example1.platforms;

public class TwitchTV implements IPlatform{
    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: transmissão iniciada!");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Configurado RMTP!");

    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o canal.");

    }

    @Override
    public String getName() {
        return "TwitchTV";
    }
}
