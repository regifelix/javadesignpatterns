package br.com.regifelix.designpatterns.factory.vehicles;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Ja pegamos a comida");
    }

    @Override
    public void getCargo() {
        System.out.println("Iniciando o delivery");

    }
}
