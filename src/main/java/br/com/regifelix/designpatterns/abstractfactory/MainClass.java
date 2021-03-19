package br.com.regifelix.designpatterns.abstractfactory;

import br.com.regifelix.designpatterns.abstractfactory.app.Application;
import br.com.regifelix.designpatterns.abstractfactory.factory.BoatTransport;
import br.com.regifelix.designpatterns.abstractfactory.factory.ITransporteFactory;
import br.com.regifelix.designpatterns.abstractfactory.factory.NineNineTransport;
import br.com.regifelix.designpatterns.abstractfactory.factory.UberTransport;

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
