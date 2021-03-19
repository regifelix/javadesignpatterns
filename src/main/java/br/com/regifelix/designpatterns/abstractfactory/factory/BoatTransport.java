package br.com.regifelix.designpatterns.abstractfactory.factory;

import br.com.regifelix.designpatterns.abstractfactory.aircrafts.AirPlane;
import br.com.regifelix.designpatterns.abstractfactory.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.boats.Boat;
import br.com.regifelix.designpatterns.abstractfactory.boats.IBoat;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.Car;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.ILandVehicle;


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
