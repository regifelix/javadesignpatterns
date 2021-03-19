package br.com.regifelix.designpatterns.factory.transportexample;

import br.com.regifelix.designpatterns.factory.transportexample.vehicles.IVehicle;

public abstract class Transport {
    
    public void startTransporte(){
        IVehicle vehicle = createVehicle();
        vehicle.startRoute();
    }

    protected abstract IVehicle createVehicle();
}
