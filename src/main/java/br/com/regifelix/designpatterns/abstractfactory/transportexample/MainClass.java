package br.com.regifelix.designpatterns.abstractfactory.transportexample;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.app.Application;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.factory.BoatTransport;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.factory.ITransporteFactory;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.factory.NineNineTransport;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.factory.UberTransport;

public class MainClass {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();

    }

    public static Application configureApplication(){
        Application app;
        ITransporteFactory factory;
        String company = "boat";

        switch (company){
            case "uber":
                factory = new UberTransport();
                break;
            case "99":
                factory = new NineNineTransport();
                break;
            case "boat":
                factory = new BoatTransport();
                break;
            default:
                throw new IllegalArgumentException();
        }

        app = new Application(factory);
        return app;
    }
}
