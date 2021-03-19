package br.com.regifelix.designpatterns.factory;

import br.com.regifelix.designpatterns.factory.vehicles.IVehicle;

public abstract class Transport {
    
    public void startTransporte(){
        IVehicle vehicle = createVehicle();
        vehicle.startRoute();
    }

    protected abstract IVehicle createVehicle();
}
