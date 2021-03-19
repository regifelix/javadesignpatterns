package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample;

import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.animal.IAnimal;
import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.color.IColor;

/**
 *  Exemplo Abstract Factory retirado do site
 *  https://www.baeldung.com/java-abstract-factory-pattern
 */
public class MainClass {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        IAbstractFactory<IAnimal> abstractFactoryAnimal = factoryProvider.getFactory("Animal");
        IAnimal animal = abstractFactoryAnimal.create("Duck");
        System.out.println("Animal do tipo " + animal.getType() + " faz o som " + animal.makeSound());

        IAbstractFactory<IColor> abstractFactoryColor = factoryProvider.getFactory("Color");
        IColor color = abstractFactoryColor.create("Black");
        System.out.println("Cor do tipo " + color.getColor() );

    }
}
