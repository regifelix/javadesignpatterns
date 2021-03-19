package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.animal;

import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.IAbstractFactory;

public class AnimalFactory implements IAbstractFactory<IAnimal> {
    @Override
    public IAnimal create(String animalType) {
        if("Dog".equals(animalType)){
            return new Dog();
        }else if("Bear".equals(animalType)){
            return new Bear();
        }
        return new Duck();
    }
}
