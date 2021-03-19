package br.com.regifelix.designpatterns.abstractfactory.app;

import br.com.regifelix.designpatterns.abstractfactory.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.boats.IBoat;
import br.com.regifelix.designpatterns.abstractfactory.factory.IBoatTransportFactory;
import br.com.regifelix.designpatterns.abstractfactory.factory.ITransporteFactory;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.ILandVehicle;

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
