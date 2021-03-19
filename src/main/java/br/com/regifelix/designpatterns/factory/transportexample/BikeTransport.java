package br.com.regifelix.designpatterns.factory.transportexample;

import br.com.regifelix.designpatterns.factory.transportexample.vehicles.IVehicle;
import br.com.regifelix.designpatterns.factory.transportexample.vehicles.Bike;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createVehicle() {
        return new Bike();
    }
}
