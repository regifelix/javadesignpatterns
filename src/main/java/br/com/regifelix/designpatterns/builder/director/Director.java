package br.com.regifelix.designpatterns.builder.director;

import br.com.regifelix.designpatterns.builder.builders.IBuilder;
import br.com.regifelix.designpatterns.builder.components.CarType;
import br.com.regifelix.designpatterns.builder.components.Color;
import br.com.regifelix.designpatterns.builder.components.Engine;
import br.com.regifelix.designpatterns.builder.components.Transmission;

/* O director é responsável no Design pattern do builder em disser a
    sequencia de passos a serem executados para criar o produto do builder
 */
public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
        builder.setColor(Color.WHITE);
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENCIAL);
        builder.setEngine(new Engine(13000));
        builder.setColor(Color.WHITE);
    }

    public void constructCarSport(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(13000));
        builder.setColor(Color.RED);
    }
}
