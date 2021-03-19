package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.animal;

public class Dog implements IAnimal {

    @Override
    public String getType() {
        return "Mamífero";
    }

    @Override
    public String makeSound() {
        return "Latido";
    }
}
