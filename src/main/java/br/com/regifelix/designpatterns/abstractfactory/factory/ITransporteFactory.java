package br.com.regifelix.designpatterns.abstractfactory.factory;

import br.com.regifelix.designpatterns.abstractfactory.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.boats.IBoat;
import br.com.regifelix.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public interface ITransporteFactory {
    ILandVehicle createTransportVehicle();
    IAirCraft createTransportAirCraft();

}
