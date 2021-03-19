package br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles;

public class Motorcycle implements ILandVehicle{

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");

    }
}
