package br.com.regifelix.designpatterns.bridge.example1.transmissions;

import br.com.regifelix.designpatterns.bridge.example1.platforms.IPlatform;

public class AdvancedLive extends Live{

    public AdvancedLive(IPlatform platform) {
        super(platform);
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na transmissão!");
    }

    public void comments(){
        System.out.println("Comentários liberadas na live.");
    }
}
