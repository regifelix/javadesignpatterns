package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.animal;

public class Duck implements IAnimal{
    @Override
    public String getType() {
        return "Ave";
    }

    @Override
    public String makeSound() {
        return "qua qua";
    }
}
