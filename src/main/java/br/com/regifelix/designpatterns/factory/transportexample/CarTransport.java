package br.com.regifelix.designpatterns.factory.transportexample;

import br.com.regifelix.designpatterns.factory.transportexample.vehicles.Car;
import br.com.regifelix.designpatterns.factory.transportexample.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createVehicle() {
        return new Car();
    }
}
