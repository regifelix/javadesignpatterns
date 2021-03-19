package br.com.regifelix.designpatterns.abstractfactory.transportexample.factory;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.AirPlane;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.Car;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.ILandVehicle;

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
