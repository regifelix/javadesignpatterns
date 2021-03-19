package br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts;

public class AirPlane implements IAirCraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");

    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo, vôo autorizado!");

    }

    @Override
    public void wind() {
        System.out.println("Ventos a 25 km, ventos ok!");

    }
}
