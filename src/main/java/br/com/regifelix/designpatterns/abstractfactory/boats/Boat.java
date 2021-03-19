package br.com.regifelix.designpatterns.abstractfactory.boats;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        getCargo();
        sail();
        System.out.println("Saindo do porto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros");

    }

    @Override
    public void sail() {
        System.out.println("Mar tranquilo, podemos partir!");

    }
}
