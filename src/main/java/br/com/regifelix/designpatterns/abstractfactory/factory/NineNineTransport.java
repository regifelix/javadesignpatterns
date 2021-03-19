package br.com.regifelix.designpatterns.abstractfactory.factory;

import br.com.regifelix.designpatterns.abstractfactory.aircrafts.Helicopter;
import br.com.regifelix.designpatterns.abstractfactory.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.Motorcycle;

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
