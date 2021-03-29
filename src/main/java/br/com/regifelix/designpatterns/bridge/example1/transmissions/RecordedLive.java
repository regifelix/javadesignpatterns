package br.com.regifelix.designpatterns.bridge.example1.transmissions;

import br.com.regifelix.designpatterns.bridge.example1.platforms.IPlatform;

public class RecordedLive extends Live{
    public RecordedLive(IPlatform platform) {
        super(platform);
    }

    public void record(){
        System.out.println(platform.getName() + ":" + "Video gravado com sucesso!");
    }
}
