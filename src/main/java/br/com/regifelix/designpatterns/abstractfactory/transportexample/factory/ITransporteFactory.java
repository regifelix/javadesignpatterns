package br.com.regifelix.designpatterns.abstractfactory.transportexample.factory;

import br.com.regifelix.designpatterns.abstractfactory.transportexample.aircrafts.IAirCraft;
import br.com.regifelix.designpatterns.abstractfactory.transportexample.landvehicles.ILandVehicle;

public interface ITransporteFactory {
    ILandVehicle createTransportVehicle();
    IAirCraft createTransportAirCraft();

}
