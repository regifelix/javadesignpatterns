package br.com.regifelix.designpatterns.factory;

public class MainClass {

    public static Transport transport;

    public static void main(String[] args) {

        configure(args[0]);

        if(transport != null){
            runTransport();
        }

    }

    private static void runTransport() {
        transport.startTransporte();
    }

    private static void configure(String type) {
        switch (type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BikeTransport();
                break;
            default:
                transport = null;
        }
    }
}
