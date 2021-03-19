package br.com.regifelix.designpatterns.factory;

import br.com.regifelix.designpatterns.factory.vehicles.IVehicle;
import br.com.regifelix.designpatterns.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport  {
    @Override
    protected IVehicle createVehicle() {
        return new Motorcycle();
    }
}
