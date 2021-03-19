package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.color;

import br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample.IAbstractFactory;

public class ColorFactory implements IAbstractFactory<IColor> {
    @Override
    public IColor create(String type) {
        if("Whtie".equals(type)){
            return new White();
        }else if ("Black".equals(type)){
            return new Black();
        }else if ("Brown".equals(type)){
            return new Brown();
        }
        throw new IllegalArgumentException();
    }
}
