package br.com.regifelix.designpatterns.abstractfactory.transportexample.factory;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.Helicopter;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.ILandVehicle;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.Motorcycle;

public class NineNineTransport implements ITransporteFactory{

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAirCraft createTransportAirCraft() {
        return new Helicopter();
    }
}
