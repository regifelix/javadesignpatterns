package br.com.regifelix.designpatterns.abstractfactory.transportexample.factory;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.AirPlane;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.boats.Boat;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.boats.IBoat;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.Car;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.ILandVehicle;


public class BoatTransport implements IBoatTransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAirCraft createTransportAirCraft() {
        return new AirPlane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
