package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample;

import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.animal.AnimalFactory;
import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.animal.IAnimal;
import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.color.ColorFactory;

public class FactoryProvider {

    IAbstractFactory getFactory(String choice){
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;

    }
}
