package br.com.regifelix.designpatterns.abstractfactory.transportexample.app;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.boats.IBoat;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.factory.IBoatTransportFactory;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.factory.ITransporteFactory;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAirCraft airCraft;
    private IBoat boat;

    public Application(ITransporteFactory factory){
        vehicle = factory.createTransportVehicle();
        airCraft = factory.createTransportAirCraft();
        if(factory instanceof IBoatTransportFactory){
            var boatFactory = (IBoatTransportFactory) factory;
            boat = boatFactory.createTransportBoat();
        }
    }

    public void startRoute(){
        vehicle.startRoute();
        airCraft.startRoute();
        if(boat != null){
            boat.startRoute();
        }
    }
}
