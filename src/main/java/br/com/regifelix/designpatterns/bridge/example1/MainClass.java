package br.com.regifelix.designpatterns.bridge.example1;

import br.com.regifelix.designpatterns.bridge.example1.platforms.*;
import br.com.regifelix.designpatterns.bridge.example1.transmissions.RecordedLive;

/**
 * No Bridge temos a abstração que no caso desse exemplo é Live, e a implementação que sao as plaformas de transmissao da live.
 * O importante que tanto a implentação quando a abstração sejam escalonaveis e possam ser extendidas para agregar novas funções sem que isso quebre uma a outra.
 */
public class MainClass {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new FacebookLive());
        startLive(new TwitchTV());
        startLive(new DisneyPlus());

    }

    public static void startLive(IPlatform platform){
        /**
        System.out.println("Inciando a transmissão... Aguarde");

        Live live = new Live(platform);
        live.broacasting();
        live.result();
         **/


        /**

        System.out.println("Transmissão avançada!");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broacasting();
        advancedLive.comments();
        advancedLive.subtitles();

         **/

        System.out.println("Transmissão gravada!");
        RecordedLive live = new RecordedLive(platform);
        live.broacasting();
        live.record();


    }
}
