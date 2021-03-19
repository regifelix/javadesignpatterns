package br.com.regifelix.designpatterns.factory.transportexample.vehicles;

public class Car implements IVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a rota.");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos o cliente");

    }
}
