package br.com.regifelix.designpatterns.abstractfactory.transportexample.factory;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.boats.IBoat;

public interface IBoatTransportFactory extends ITransporteFactory{

    IBoat createTransportBoat();
}
