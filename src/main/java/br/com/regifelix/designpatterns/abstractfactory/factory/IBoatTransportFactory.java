package br.com.regifelix.designpatterns.abstractfactory.factory;

import br.com.regifelix.designpatterns.abstractfactory.boats.IBoat;

public interface IBoatTransportFactory extends ITransporteFactory{

    IBoat createTransportBoat();
}
