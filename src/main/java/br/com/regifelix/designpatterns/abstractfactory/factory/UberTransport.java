package br.com.regifelix.designpatterns.abstractfactory.factory;

import br.com.regifelix.designpatterns.abstractfactory.aircrafts.AirPlane;
import br.com.regifelix.designpatterns.abstractfactory.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.Car;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransporteFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraft createTransportAirCraft() {
        return new AirPlane();
    }
}
