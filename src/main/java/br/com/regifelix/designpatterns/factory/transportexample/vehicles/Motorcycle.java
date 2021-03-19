package br.com.regifelix.designpatterns.factory.transportexample.vehicles;

public class Motorcycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Ja pegamentos a encomenda");

    }
}
