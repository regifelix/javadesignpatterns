package br.com.regifelix.designpatterns.abstractfactory.aircrafts;

public class Helicopter implements IAirCraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");

    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros ok, ligando hélices!");
    }

    @Override
    public void wind() {
        System.out.println("Vendos a 25km, sudeste, ventos ok!");
    }
}
