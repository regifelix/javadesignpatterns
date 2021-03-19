package br.com.regifelix.designpatterns.factory;

import br.com.regifelix.designpatterns.factory.vehicles.Car;
import br.com.regifelix.designpatterns.factory.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createVehicle() {
        return new Car();
    }
}
