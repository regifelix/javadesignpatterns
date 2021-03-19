package br.com.regifelix.designpatterns.factory;

import br.com.regifelix.designpatterns.factory.vehicles.Bike;
import br.com.regifelix.designpatterns.factory.vehicles.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createVehicle() {
        return new Bike();
    }
}
