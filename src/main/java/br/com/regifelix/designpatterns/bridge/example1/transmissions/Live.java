package br.com.regifelix.designpatterns.bridge.example1.transmissions;

import br.com.regifelix.designpatterns.bridge.example1.platforms.IPlatform;

public class Live implements ITransmission{

    protected IPlatform platform;

    public Live() {
    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }

    @Override
    public void broacasting() {
        System.out.println(platform.getName() +  ":" + "Iniciando a transmissão!");
    }

    @Override
    public void result() {
        System.out.println(platform.getName() +  ":" + "***** ON AIR ******");
    }
}
