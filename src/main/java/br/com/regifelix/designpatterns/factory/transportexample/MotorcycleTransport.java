package br.com.regifelix.designpatterns.factory.transportexample;

import br.com.regifelix.designpatterns.factory.transportexample.vehicles.IVehicle;
import br.com.regifelix.designpatterns.factory.transportexample.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport  {
    @Override
    protected IVehicle createVehicle() {
        return new Motorcycle();
    }
}
