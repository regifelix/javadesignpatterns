package br.com.regifelix.designpatterns.abstractfactory.factoryproviderexample;

public interface IAbstractFactory<T>{
    T create(String type);
}
